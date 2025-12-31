public class CarRental{
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000;

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    void totalCost() {
        System.out.println("Total Cost: ₹" + (rentalDays * costPerDay));
    }
}