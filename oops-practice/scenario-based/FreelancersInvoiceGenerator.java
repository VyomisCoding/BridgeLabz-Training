import java.util.*;

public class FreelancersInvoiceGenerator {
    public static String[] parseInvoice(String input){   // This method splits the full invoice string into individual tasks
        // Example input format:
        return input.split(",");    // Logo Design - 3000 INR, Web Page - 4500 INR
    }

    public static int getTotalAmount(String[] tasks){  // This method extracts amounts and calculates total invoice value
        int total = 0;

        for (String task : tasks) {
            String[] parts = task.split("-");    // Each task looks like: "Logo Design - 3000 INR"

            // Take the amount part and remove extra spaces
            String amountPart = parts[1].trim(); // "3000 INR"
            String amount = amountPart.split(" ")[0]; // "3000"

            total += Integer.parseInt(amount);
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

        String[] tasks = parseInvoice(input);   // Parsing invoice string

        System.out.println("\nInvoice Breakdown:");   // Display parsed invoice items
        for (String task : tasks) {
            System.out.println(task.trim());
        }

        int totalAmount = getTotalAmount(tasks);   // Calculating total amount

        System.out.println("\nTotal Invoice Amount: " + totalAmount + " INR"); // Display total invoice amount
        
    }
}
