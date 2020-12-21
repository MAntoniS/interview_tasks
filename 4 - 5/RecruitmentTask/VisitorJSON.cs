using RecruitmentTask.interfaces;

using System.Text.Json;

namespace RecruitmentTask
{
    class VisitorJSON : ISerializeVisitor
    {
        public string SerializeLog(LogEntry entry)
        {
            return JsonSerializer.Serialize(entry);
        }
    }
}
