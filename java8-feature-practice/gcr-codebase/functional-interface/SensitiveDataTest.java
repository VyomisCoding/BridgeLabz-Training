// Entire marker interface example in ONE class file
public class SensitiveDataTest{

    interface SensitiveData { }       // Custom Marker Interface

    static class EmployeeInfo implements SensitiveData{     // Class marked as Sensitive
        String name;
        String aadhaar; 
        double salary;
        EmployeeInfo(String name, String aadhaar, double salary){
            this.name = name;
            this.aadhaar = aadhaar;
            this.salary = salary;
        }
    }

    public static void process(Object obj){     // Processor that checks marker interface
        if(obj instanceof SensitiveData){
            System.out.println("Encrypting sensitive data...");
        }else{
            System.out.println("Normal data. No encryption needed.");
        }
    }

    public static void main(String[] args){    // Main Method
        EmployeeInfo emp = new EmployeeInfo("Raj", "1234-5678-9999", 50000);
        process(emp);           // Sensitive → Encrypt
        process("Hello");   // Not sensitive → Skip
    }
}
