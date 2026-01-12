class DeluxeRoom extends Room{
    DeluxeRoom(int roomNumber){
        super(roomNumber, 4000);
    }
    @Override
    public double getPrice(PricingStrategy pricingStrategy) {
        return pricingStrategy.calculatePrice(basePrice);
    }
}
