using System;


namespace RecruitmentTask
{
    
    class ConsoleLogOutput : ILogOutput
    {
        // TODO: save have to display log on the Console
        public void Save(string serializedLogEntry)
        {
            Console.WriteLine(serializedLogEntry);
        }
    }
}
