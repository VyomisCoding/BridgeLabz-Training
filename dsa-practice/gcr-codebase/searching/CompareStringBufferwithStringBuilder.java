//  Compare StringBuffer with StringBuilder for String Concatenation


public class CompareStringBufferwithStringBuilder{
    public static void main(String[] args){
        int iterations = 1_000_000;    // 1 million iterations to check diff clearly
        String text = "hello";
        //---------------------------------------------------------------------------
        StringBuffer sbuffer = new StringBuffer();       // StringBuffer threadSafe
        long startBuffer = System.nanoTime();
        for(int i=0;i<iterations;i++){
            sbuffer.append(text);
        }
        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer-startBuffer;
        //-------------------------------------------------------------------------------------------
        StringBuilder sbuilder = new StringBuilder();    // StringBuilder (Not Thread-Safe but Faster)
        long startBuilder = System.nanoTime();
        for(int i=0;i<iterations;i++){    
            sbuilder.append(text);
        }
        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder-startBuilder;

        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");
        if(timeBuffer > timeBuilder){
            System.out.println("StringBuilder is faster (as expected).");
        }else{
            System.out.println("StringBuffer performed better (rare).");
        }
    }
    
}
