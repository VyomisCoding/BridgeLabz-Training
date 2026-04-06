public class DiscountUtil{
    public static <T extends Product<?>> void applyDiscount(T product, double percent){    // Generic Method with Bounded Type Parameter
        double oldPrice = product.getPrice();
        double discount = (oldPrice * percent)/100;
        double newPrice = oldPrice - discount;
        product.setPrice(newPrice);
        System.out.println("Discount Applied! New Price: " + newPrice);
    }
}
