import java.io.*;

class WriterThread extends Thread{
    PipedOutputStream pos;
    WriterThread(PipedOutputStream pos){
        this.pos = pos;
    }
    public void run(){
        try{
            pos.write("Hello from Writer Thread!".getBytes());
            pos.close();
        }catch(IOException e){
            System.out.println("Writer Error: " + e.getMessage());
        }
    }
}

class ReaderThread extends Thread{
    PipedInputStream pis;
    ReaderThread(PipedInputStream pis){
        this.pis = pis;
    }

    public void run(){
        try{
            int data;
            while((data = pis.read()) != -1){
                System.out.print((char) data);
            }
            pis.close();
        }catch(IOException e){
            System.out.println("Reader Error: " + e.getMessage());
        }
    }
}

public class InterThreadCommunication{
    public static void main(String[] args) throws IOException{
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream(pis);
        WriterThread w = new WriterThread(pos);
        ReaderThread r = new ReaderThread(pis);
        w.start();
        r.start();
    }
}
