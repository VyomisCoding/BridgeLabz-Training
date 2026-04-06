public class ExceptionPropogation{
    static void method1(){
        int x = 10/0;                     // ArithmeticException
    }
    static void method2(){
        method1();                        // Exception propagated here
    }
    public static void main(String[] args){
        try{
            method2();                    // Propagated till here
        }catch(ArithmeticException e){
            System.out.println("Handled exception in main");
        }
    }
}
