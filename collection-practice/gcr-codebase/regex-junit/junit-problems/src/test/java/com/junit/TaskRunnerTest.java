package com.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TaskRunnerTest{
    @Test
    @Timeout(2)     // fail if takes more than 2 seconds
    public void testLongRunningTaskTimeout() {
        TaskRunner task = new TaskRunner();
        task.longRunningTask();
    }
}
