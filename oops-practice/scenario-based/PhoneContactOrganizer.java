import java.util.*;

class InvalidPhoneNumberException extends Exception{   // Custom Exception for invalid phone number
    public InvalidPhoneNumberException(String message){
        super(message);
    }
}

class Contact{          // Contact class to store name and phone number
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){     // Constructor
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){    // Getter methods
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void displayContact(){    // Display contact details
        System.out.println("Name: " + name + ", Phone: " + phoneNumber);
    }
}

public class PhoneContactOrganizer{   // Main organizer class
    static List<Contact> contacts = new ArrayList<>();   // List to store contacts

    static void addContact(String name, String phone) throws InvalidPhoneNumberException{       // Method to add a contact

        if (!phone.matches("\\d{10}")){      // Validate phone number length (must be exactly 10 digits)
            throw new InvalidPhoneNumberException(
                "Phone number must be exactly 10 digits: " + phone
            );
        }
        
        for (Contact c : contacts){    // Check for duplicate phone number
            if (c.getPhoneNumber().equals(phone)){
                System.out.println("Duplicate contact! Phone number already exists.");
                return;
            }
        }

        contacts.add(new Contact(name, phone));    // Add contact if valid and not duplicate
        System.out.println("Contact added successfully.");
    }

    static void deleteContact(String phone){       // Method to delete contact by phone number
        Iterator<Contact> it = contacts.iterator();

        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getPhoneNumber().equals(phone)) {
                it.remove();
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    static void searchContact(String keyword){    // Method to search contact by name or phone number
        boolean found = false;

        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(keyword)
                    || c.getPhoneNumber().equals(keyword)) {
                c.displayContact();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No contact found.");
        }
    }

    public static void main(String[] args){     // Main method
        Scanner sc = new Scanner(System.in);

        try {
            // Adding contacts
            addContact("Rahul", "9876543210");
            addContact("Anita", "9123456789");

            // Trying to add duplicate
            addContact("Ravi", "9876543210");

            // Searching contacts
            System.out.println("\nSearching for Anita:");
            searchContact("Anita");

            // Deleting contact
            System.out.println("\nDeleting contact with phone 9123456789:");
            deleteContact("9123456789");

            // Searching again
            System.out.println("\nSearching after deletion:");
            searchContact("9123456789");

        } catch (InvalidPhoneNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
