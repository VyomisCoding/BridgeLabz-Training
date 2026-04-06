import java.util.Scanner;

abstract class GoodsTransport{          // Abstract parent class for all transport types
    protected String transportId;       // Common properties
    protected String transportDate;
    protected int transportRating;

    public GoodsTransport(String transportId, String transportDate, int transportRating){   // Constructor to initialize common fields
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }

    public String getTransportId(){                // Getter methods
        return transportId;
    }

    public String getTransportDate(){
        return transportDate;
    }

    public int getRating(){
        return transportRating;
    }

    abstract public String vehicleSelection();     // Abstract methods to be implemented by child classes   
    abstract public float calculateTotalCharge();
}

class BrickTransport extends GoodsTransport{       // Brick transport implementation
    private float brickSize;                       // Brick specific properties
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String transportId, String transportDate, int transportRating,float brickSize, int brickQuantity, float brickPrice){    // Constructor
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    public float getBrickSize(){         // Getter methods
        return brickSize;
    }

    public int getBrickQuantity(){
        return brickQuantity;
    }

    public float getBrickPrice(){
        return brickPrice;
    }

    public void setBrickSize(float brickSize){            // Setter methods
        this.brickSize = brickSize;
    }

    public void setBrickQuantity(int brickQuantity){
        this.brickQuantity = brickQuantity;
    }

    public void setBrickPrice(float brickPrice){
        this.brickPrice = brickPrice;
    }

    @Override
    public String vehicleSelection(){                     // Decide vehicle based on brick quantity
        if(brickQuantity < 300){
            return "Truck";
        }else if(brickQuantity >= 300 && brickQuantity <= 500){
            return "Lorry";
        }else{
            return "MonsterLorry";
        }
    }
    
    @Override
    public float calculateTotalCharge(){                 // Calculate total transport charge
        String vehicle = vehicleSelection();             // Get selected vehicle
        float vehiclePrice = 0;
        switch(vehicle){                                 // Vehicle cost
            case "Truck":
                vehiclePrice = 1000;
                break;
            case "Lorry":
                vehiclePrice = 1700;
                break;
            case "MonsterLorry":
                vehiclePrice = 3000;
                break;
        }
        
        int discountPercentage;                         // Discount based on rating
        if(transportRating == 5){
            discountPercentage = 20;
        }else if(transportRating == 3 || transportRating == 4){
            discountPercentage = 10;
        }else{
            discountPercentage = 0;
        }
        float price = brickPrice * brickQuantity;      // Calculate price, tax and discount
        float tax = price * 0.3f;
        float discount = price * (discountPercentage / 100.0f);

        float totalCharge = price + tax + vehiclePrice - discount;     // Final total charge
        return totalCharge;
    }
}

class TimberTransport extends GoodsTransport{         // Timber transport implementation
    private float timberLength;                       // Timber specific properties
    private float timberRadius;
    private String timberType;
    private float timberPrice;
    
    // Constructor
    public TimberTransport(String transportId, String transportDate, int transportRating,float timberLength, float timberRadius, String timberType, float timberPrice){
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    public float getTimberLength(){      // Getter methods
        return timberLength;
    }

    public float getTimberRadius(){
        return timberRadius;
    }

    public String getTimberType(){
        return timberType;
    }

    public float getTimberPrice(){
        return timberPrice;
    }

    public void setTimberLength(float timberLength){   // Setter methods
        this.timberLength = timberLength;
    }

    public void setTimberRadius(float timberRadius){
        this.timberRadius = timberRadius;
    }

    public void setTimberType(String timberType){
        this.timberType = timberType;
    }

    public void setTimberPrice(float timberPrice){
        this.timberPrice = timberPrice;
    }

    @Override
    public String vehicleSelection(){                            // Decide vehicle based on timber surface area
        float area = 2 * 3.147f * timberRadius * timberLength;
        if(area < 250){
            return "Truck";
        }else if(area >= 250 && area <= 400){
            return "Lorry";
        }else{
            return "MonsterLorry";
        }
    }
    
    @Override
    public float calculateTotalCharge(){          // Calculate total transport charge
        String vehicle = vehicleSelection();      // Get selected vehicle
        float vehiclePrice = 0;
        switch(vehicle){                          // Vehicle cost
            case "Truck":
                vehiclePrice = 1000;
                break;
            case "Lorry":
                vehiclePrice = 1700;
                break;
            case "MonsterLorry":
                vehiclePrice = 3000;
                break;
        }
        int discountPercentage;                 // Discount based on rating
        if(transportRating == 5){
            discountPercentage = 20;
        }else if(transportRating == 3 || transportRating == 4){
            discountPercentage = 10;
        }else{
            discountPercentage = 0;
        }

        float volume = 3.147f * timberRadius * timberRadius * timberLength;       // Volume calculation
       
        float price = timberPrice * volume * (timberType.equalsIgnoreCase("Premium") ? 0.25f : 0.15f);     // Price based on timber type
        
        float tax = price * 0.3f;                   // Tax and discount

        float discount = price * discountPercentage / 100.0f;

        float totalCharge = price + vehiclePrice + tax - discount;     // Final total charge
        return totalCharge;
    }
}

class Utility{           // Utility class for validation and object creation
    public static boolean validateTransportId(String transportId){       // Validate transport ID using regex
        if(transportId == null || !transportId.matches("RTS\\d{3}[A-Z]")){
            System.out.println("Transport Id " + transportId + " is invalid");
            return false;
        }else{
            return true;
        }
    }
    public static GoodsTransport parseDetails(String input){  // Parse input string and create appropriate object
        String[] data = input.split(":");
        String transportId = data[0];
        if(!validateTransportId(transportId)){                // Validate ID
            return null;
        }
        String date = data[1];
        int rating = Integer.parseInt(data[2]);
        String transportType = data[3];
        if (transportType.equalsIgnoreCase("BrickTransport")){   // Create BrickTransport object
            float brickSize = Float.parseFloat(data[4]);
            int brickQuantity = Integer.parseInt(data[5]);
            float brickPrice = Float.parseFloat(data[6]);
            return new BrickTransport(transportId, date, rating, brickSize, brickQuantity, brickPrice);
        }
        
        else if (transportType.equalsIgnoreCase("TimberTransport")){    // Create TimberTransport object
            float timberLength = Float.parseFloat(data[4]);
            float timberRadius = Float.parseFloat(data[5]);
            String timberType = data[6];
            float timberPrice = Float.parseFloat(data[7]);
            return new TimberTransport(transportId, date, rating, timberLength, timberRadius, timberType, timberPrice);
        }
        return null;
    }
    
    public static String findObjectType(GoodsTransport goodsTransport){      // Identify object type
        if(goodsTransport instanceof TimberTransport){
            return "TimberTransport";
        }else if(goodsTransport instanceof BrickTransport){
            return "BrickTransport";
        }
        return "";
    }
}

public class FutureLogistic{    // Main class
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Goods Transport details");     // Read input
        String input = sc.nextLine();
        GoodsTransport transport = Utility.parseDetails(input);        // Parse input
        if(transport == null){
            return;
        }
        String type = Utility.findObjectType(transport);               // Identify transport type
        System.out.println("\nTransporter id : " + transport.getTransportId());      // Display common details
        System.out.println("Date of transport : " + transport.getTransportDate());
        System.out.println("Rating of the transport : " + transport.getRating());
        if (type.equals("BrickTransport")){         // Display BrickTransport details
            BrickTransport bt = (BrickTransport) transport;
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
        }
        if (type.equals("TimberTransport")){      // Display TimberTransport details
            TimberTransport tt = (TimberTransport) transport;
            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
        }
        System.out.println("Vehicle for transport : " + transport.vehicleSelection());    // Final output
        System.out.println("Total charge : " + transport.calculateTotalCharge());
    }
}