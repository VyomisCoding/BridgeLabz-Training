import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Meal<VegetarianMeal> vegMeals = new Meal<>();          // Generic meal collections
        Meal<VeganMeal> veganMeals = new Meal<>();
        Meal<KetoMeal> ketoMeals = new Meal<>();
        Meal<HighProteinMeal> highProteinMeals = new Meal<>();
        while(true){
            System.out.println("\n--- Personalized Meal Plan Generator ---");
            System.out.println("1. Add Vegetarian Meal");
            System.out.println("2. Add Vegan Meal");
            System.out.println("3. Add Keto Meal");
            System.out.println("4. Add High-Protein Meal");
            System.out.println("5. Generate Meal Plan");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine(); // flush
            switch(ch){
                case 1:
                    System.out.print("Enter Vegetarian Dish Name: ");
                    String vdish = sc.nextLine();
                    VegetarianMeal v = new VegetarianMeal(vdish);
                    vegMeals.addMeal(v);
                    System.out.println("Vegetarian Meal Added!");
                    break;
                case 2:
                    System.out.print("Enter Vegan Dish Name: ");
                    String vegandish = sc.nextLine();
                    VeganMeal vg = new VeganMeal(vegandish);
                    veganMeals.addMeal(vg);
                    System.out.println("Vegan Meal Added!");
                    break;
                case 3:
                    System.out.print("Enter Keto Dish Name: ");
                    String kdish = sc.nextLine();
                    KetoMeal k = new KetoMeal(kdish);
                    ketoMeals.addMeal(k);
                    System.out.println("Keto Meal Added!");
                    break;
                case 4:
                    System.out.print("Enter High Protein Dish Name: ");
                    String hdish = sc.nextLine();
                    HighProteinMeal hp = new HighProteinMeal(hdish);
                    highProteinMeals.addMeal(hp);
                    System.out.println("High-Protein Meal Added!");
                    break;
                case 5:
                    System.out.println("\n--- Choose Category to Generate Meal Plan ---");
                    System.out.println("1. Vegetarian");
                    System.out.println("2. Vegan");
                    System.out.println("3. Keto");
                    System.out.println("4. High-Protein");
                    System.out.print("Enter choice: ");
                    int type = sc.nextInt();
                    sc.nextLine();
                    switch(type){
                        case 1:
                            if (!vegMeals.getMeals().isEmpty()) {
                                MealPlanGenerator.generateMeal(vegMeals.getMeals().get(0));
                            } else System.out.println("No Vegetarian Meal added yet!");
                            break;

                        case 2:
                            if (!veganMeals.getMeals().isEmpty()) {
                                MealPlanGenerator.generateMeal(veganMeals.getMeals().get(0));
                            } else System.out.println("No Vegan Meal added yet!");
                            break;

                        case 3:
                            if (!ketoMeals.getMeals().isEmpty()) {
                                MealPlanGenerator.generateMeal(ketoMeals.getMeals().get(0));
                            } else System.out.println("No Keto Meal added yet!");
                            break;

                        case 4:
                            if (!highProteinMeals.getMeals().isEmpty()) {
                                MealPlanGenerator.generateMeal(highProteinMeals.getMeals().get(0));
                            } else System.out.println("No High-Protein Meal added yet!");
                            break;

                        default:
                            System.out.println("Invalid Category!");
                    }
                    break;
                case 6:
                    System.out.println("Exiting Meal Plan Generator...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
