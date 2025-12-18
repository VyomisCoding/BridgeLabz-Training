public class studentFee {
    public static void main(String[] args) {
        double totalFees = 125000;
        double discountPercent=10;
        double discount=(totalFees*discountPercent)/100;
        double finalFee = totalFees-discount;
        System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR " + finalFee);
    }
    
}
