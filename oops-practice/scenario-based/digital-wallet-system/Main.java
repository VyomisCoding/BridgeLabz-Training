public class Main{
    public static void main(String[] args){
        User u1 = new User(1, "Vyomesh");
        User u2 = new User(2, "Rahul");

        Wallet w1 = new Wallet(u1);
        Wallet w2 = new Wallet(u2);
        w1.addMoney(5000);

        TransferService transferService = new WalletTransfer(); // Polymorphism
        try{
            transferService.transfer(w1, w2, 2000);
            w1.withdraw(1000);
        }catch(InsufficientBalanceException e){
            System.out.println("⚠️ " + e.getMessage());
        }
        System.out.println("\n💳 " + u1.name + " Balance: INR" + w1.getBalance());
        System.out.println("💳 " + u2.name + " Balance: INR" + w2.getBalance());
        w1.showTransactions();
    }
}
