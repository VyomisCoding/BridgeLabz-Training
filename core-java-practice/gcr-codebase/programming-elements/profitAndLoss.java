public class ProfitAndLoss {
    public static void main(String[] args) {
        // given cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;
        // variables to store profit/loss and percentage
        int profitOrLoss;
        double percentage;

        System.out.println("The Cost Price is INR " + costPrice +" and Selling Price is INR "+ sellingPrice +"");

         // Checking whether there is profit or loss
        if (sellingPrice > costPrice) {
            profitOrLoss = sellingPrice - costPrice;
            percentage = Math.round(((profitOrLoss * 100.0) / costPrice)*100.0)/100.0;
            System.out.println("The Profit is INR " + profitOrLoss +" and the Profit Percentage is " + percentage + "%");

        } else if (costPrice > sellingPrice) {
            profitOrLoss = costPrice - sellingPrice;
            percentage = Math.round(((profitOrLoss * 100.0) / costPrice)*100.0)/100.0;
            System.out.println("The loss is INR " + profitOrLoss + " and Loss Percentage is "+ percentage+"%");
        } else{
            System.out.println("No Profit, no loss");
        }
    }
}