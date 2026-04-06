abstract class Room{
    protected int roomNumber;
    protected double basePrice;
    protected boolean isAvailable = true;
    Room(int roomNumber, double basePrice){
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void bookRoom(){
        isAvailable = false;
    }
    public void checkoutRoom(){
        isAvailable = true;
    }
    public abstract double getPrice(PricingStrategy pricingStrategy);
}
