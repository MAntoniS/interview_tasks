using RecruitmentTask.interfaces;
using System;
using System.Collections.Generic;
using System.Text;

namespace RecruitmentTask
{
    interface ILogger
    {
        void Log(LogEntry logEntry, ISerializeVisitor visitor);
    }
}
