using RecruitmentTask.interfaces;
using System.IO;
using System.Xml.Serialization;

namespace RecruitmentTask
{
    class VisitorXml : ISerializeVisitor
    {

        public string SerializeLog(LogEntry entry)
        {
            var srtingWriter = new StringWriter();
            var serializer = new XmlSerializer(typeof(LogEntry));
            serializer.Serialize(srtingWriter, entry);
            return srtingWriter.ToString();
        }
    }
}
