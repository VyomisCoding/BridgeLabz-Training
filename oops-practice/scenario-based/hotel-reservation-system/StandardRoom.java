class StandardRoom extends Room{
    StandardRoom(int roomNumber){
        super(roomNumber, 2000);
    }
    @Override
    public double getPrice(PricingStrategy pricingStrategy) {
        return pricingStrategy.calculatePrice(basePrice);
    }
}
