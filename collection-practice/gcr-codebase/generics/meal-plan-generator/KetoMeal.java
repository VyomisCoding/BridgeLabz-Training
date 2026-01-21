public class KetoMeal implements MealPlan{
    private String dishName;
    public KetoMeal(String dishName){
        this.dishName = dishName;
    }
    @Override
    public String getMealType(){
        return "Keto Meal";
    }
    @Override
    public void showMealDetails(){
        System.out.println("Dish: " + dishName + " | Type: Keto");
    }
}
