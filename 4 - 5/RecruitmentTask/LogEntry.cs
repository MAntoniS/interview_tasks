﻿using System;


namespace RecruitmentTask
{
    public class LogEntry
    {
        public DateTime Timestamp { get; set; }
        public string Message { get; set; }
        public string[] Tags { get; set; }
    }
}
