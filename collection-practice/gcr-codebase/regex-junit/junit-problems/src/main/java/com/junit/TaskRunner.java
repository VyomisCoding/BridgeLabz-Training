package com.junit;

public class TaskRunner{
    public void longRunningTask(){      // Simulate long-running task
        try{
            Thread.sleep(3000);  // 3 seconds
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
