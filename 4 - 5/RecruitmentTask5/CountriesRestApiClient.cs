﻿using System;
using System.Collections.Generic;
using System.IO;
using System.Net.Http;
using System.Runtime.Serialization.Json;
using System.Text;
using System.Threading.Tasks;

namespace RecruitmentTask5
{
    class CountriesRestApiClient
    {
        public async Task<CountryDto[]> GetCountries(string countryName)
        {
            var query = $"name/{countryName}";
            var countries = await GetData<CountryDto[]>(query);

            if (countries.Length == 0)
            {
                throw new Exception($"Nie udało się odnaleźć informacji na temat państwa: {countryName}.");
            }

            return countries;
        }

        private async Task<T> GetData<T>(string query)
            where T : class
        {
            var client = new HttpClient();

            var requestUri = $"https://restcountries-v1.p.rapidapi.com/{query}";
            var request = new HttpRequestMessage(HttpMethod.Get, requestUri);
            AppendRapidApiHttpRequestHeaders(request);

            var response = await client.SendAsync(request);
            var responseContent = await response.Content.ReadAsStringAsync();

            var serializer = new DataContractJsonSerializer(typeof(CountryDto[]));
            var stream = new MemoryStream(Encoding.UTF8.GetBytes(responseContent));
            var data = serializer.ReadObject(stream) as T;
            return data;
        }

        private void AppendRapidApiHttpRequestHeaders(HttpRequestMessage httpRequestMessage)
        {
            // Request musi mieć dołączone odpowiednie nagłówki http zgodnie z: https://rapidapi.com/apilayernet/api/rest-countries-v1
            httpRequestMessage.Headers.Add("x-rapidapi-host", "restcountries-v1.p.rapidapi.com");
            httpRequestMessage.Headers.Add("x-rapidapi-key", "02e933c494mshd699fecee0021fdp1315d0jsn62f6eff166fd");
        }
    }
}
