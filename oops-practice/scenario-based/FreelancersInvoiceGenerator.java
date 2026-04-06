import java.util.*;

class InvalidInvoiceFormatException extends Exception{   // Custom Exception as required
    public InvalidInvoiceFormatException(String message){
        super(message);
    }
}

public class FreelancersInvoiceGenerator {
    public static String[] parseInvoice(String input){    // This method splits the full invoice string into individual tasks
        // Example input: Logo Design - 3000 INR, Web Page - 4500 INR
        return input.split(",");
    }

    public static int getTotalAmount(String[] tasks) throws InvalidInvoiceFormatException{   // This method extracts amounts and calculates total invoice value
        int total = 0;
        for (String task : tasks){
            if (!task.contains("-")){  // Check if dash is present
                throw new InvalidInvoiceFormatException("Missing '-' in task: " + task.trim());
            }
            String[] parts = task.split("-");
            // Check if amount part exists
            if (parts.length < 2) {
                throw new InvalidInvoiceFormatException("Invalid format for task: " + task.trim());
            }

            String amountPart = parts[1].trim(); // e.g. "3000 INR"
            String[] amountSplit = amountPart.split(" ");

            // Check if numeric amount is present
            if (amountSplit.length == 0) {
                throw new InvalidInvoiceFormatException("Amount missing in task: " + task.trim());
            }
            
            try {
                int amount = Integer.parseInt(amountSplit[0]);
                total += amount;
            } catch (NumberFormatException e) {
                throw new InvalidInvoiceFormatException("Invalid amount in task: " + task.trim());
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter invoice details in the below format:");
        System.out.println("Task Name - Amount INR, Task Name - Amount INR");
        System.out.println("Example:");
        System.out.println("Logo Design - 3000 INR, Web Page - 4500 INR");
        System.out.println("--------------------------------------------");

        System.out.print("Enter invoice details: ");
        String input = sc.nextLine();

        try {
            String[] tasks = parseInvoice(input);

            System.out.println("\nInvoice Breakdown:");
            for (String task : tasks) {
                System.out.println(task.trim());
            }

            int totalAmount = getTotalAmount(tasks);
            System.out.println("\nTotal Invoice Amount: " + totalAmount + " INR");

        } catch (InvalidInvoiceFormatException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
}
