using System;
using System.Collections.Generic;
using System.Text;

namespace RecruitmentTask.interfaces
{
    interface ISerializeVisitor
    {
        string SerializeLog(LogEntry entry);

    }
}
