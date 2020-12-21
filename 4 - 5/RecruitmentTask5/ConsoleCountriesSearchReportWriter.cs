using System;
using System.Collections.Generic;
using System.Text;

namespace RecruitmentTask5
{
    class ConsoleCountriesSearchReportWriter
    {
        public void Write(CountryDto[] foundCountries) // zapis raportu na konsolę
        {
            Console.WriteLine("Odanelziono następujące państwa:");

            foreach (var country in foundCountries)
            {
                Console.WriteLine($"- {country.Name.ToUpper()}");
                Console.WriteLine($"  - stolica : {country.Capital}");
                Console.WriteLine($"  - ludność: {country.Population / 1e6} milionów");
                Console.WriteLine($"  - powierzchnia: {country.Area} km^2");
                Console.WriteLine($"  - szerokość geograficzna: {Latitude(country)} ");
                Console.WriteLine($"  - długość geograficzna: {Longitude(country)} ");
                Console.WriteLine($"  - gęstosć zaludnienia: {populationDensity(country)} os/km^2");
                Console.WriteLine($"  - alpha3Code: {country.Alpha3Code} ");

            }
        }

        private double? populationDensity(CountryDto country) => country.Population / country.Area;

        private string Latitude(CountryDto country) {
            if (IsLatLngAvailable(country))
            {
                if (country.LatLng[0] > 0)
                {
                    return $"{country.LatLng[0]}°N";
                }
                return $"{-1 * country.LatLng[0]}°S";
            }
            return "No data.";
        }

        private string Longitude(CountryDto country)
        {
            if (IsLatLngAvailable(country))
            {
                if (country.LatLng[1] > 0)
                {
                    return $"{country.LatLng[1]}°E";
                }
                return $"{-1 * country.LatLng[1]}°W";
            }
            return "No data.";
        }

        private static bool IsLatLngAvailable(CountryDto country) => country.LatLng.Length != 0;
    }
}
