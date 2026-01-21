public class MealPlanGenerator{
    public static <T extends MealPlan> void generateMeal(T meal){         // Generic method with bounded type parameter
        System.out.println("\nGenerating Personalized Meal Plan.");
        System.out.println("Meal Type: " + meal.getMealType());
        meal.showMealDetails();
    }
}
