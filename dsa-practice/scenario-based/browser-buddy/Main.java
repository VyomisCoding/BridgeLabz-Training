import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ClosedTabStack closedTabs = new ClosedTabStack();
        Tab tab = new Tab("Yahoo-Browser");
        int choice;
        do {
            System.out.println("\nBrowser Menu");
            System.out.println("1. Visit Page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Close Tab");
            System.out.println("5. Reopen Tab");
            System.out.println("6. Exit");

            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter URL: ");
                    tab.history.visit(sc.nextLine());
                    break;
                case 2:
                    tab.history.back();
                    break;
                case 3:
                    tab.history.forward();
                    break;
                case 4:
                    closedTabs.closeTab(tab);
                    break;
                case 5:
                    Tab restored = closedTabs.reopenTab();
                    if (restored != null)
                        tab = restored;
                    break;
            }
        } while (choice != 6);
    }
}
