using System;


namespace RecruitmentTask
{
    class Tester4
    {
        public void Test()
        {
            var fileLogOutput = new ConsoleLogOutput();
            var logger = new Logger(fileLogOutput);
            var visitor = new VisitorXml();
            logger.Log(new LogEntry() { Message = "test", Tags = new[] { "t1", "t2" }, Timestamp = DateTime.UtcNow }, visitor);
        }
    }
}
