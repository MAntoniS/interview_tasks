using System;
using System.IO;

namespace RecruitmentTask
{
    class FileLogOutput : ILogOutput
    {

        string filePath;

        public FileLogOutput(string fullPath) {
            filePath = fullPath;
        }
        // TODO : implement Save() so it can save the log data into a file
        public void Save(string serializedLogEntry)
        {
            try
            {
                File.WriteAllText(filePath, serializedLogEntry);
            }
            catch (UnauthorizedAccessException e){
                Console.WriteLine(e);
            }
        }
    }
}
