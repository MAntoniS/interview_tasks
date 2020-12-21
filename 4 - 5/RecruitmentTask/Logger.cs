using RecruitmentTask.interfaces;
using System;
using System.Collections.Generic;
using System.Text;
using System.Text.Json;

namespace RecruitmentTask
{
    class Logger : ILogger
    {
      
        private readonly ILogOutput _logOutput;

        public Logger(ILogOutput logOutput)
        {
            _logOutput = logOutput;
         
        }

        // TODO : modify this method as a visitor 
        public void Log(LogEntry logEntry, ISerializeVisitor visitor)
        {
            var serializedLogEntry = visitor.SerializeLog(logEntry);


            _logOutput.Save(serializedLogEntry);
        }
        
    }
}
