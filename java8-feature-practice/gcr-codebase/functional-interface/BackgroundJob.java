public class BackgroundJob{
    public static void main(String[] args){
        Runnable job = () -> {                 // Runnable using lambda
            System.out.println("Background Job Started...");     
            try{
                Thread.sleep(2000);   // simulate delay
            }catch(Exception e){}
            System.out.println("Background Job Completed!");
        };
        Thread t1 = new Thread(job);     // Running thread asynchronously
        t1.start();
        System.out.println("Main thread is free to do other work...");
    }
}
