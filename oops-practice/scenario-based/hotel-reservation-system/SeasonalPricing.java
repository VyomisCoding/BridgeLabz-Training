class SeasonalPricing implements PricingStrategy{
    private double multiplier;
    SeasonalPricing(double multiplier) {
        this.multiplier = multiplier; // e.g. 1.5 for peak season
    }
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * multiplier;
    }
}
