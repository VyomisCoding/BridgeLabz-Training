public class VeganMeal implements MealPlan{
    private String dishName;
    public VeganMeal(String dishName){
        this.dishName = dishName;
    }
    @Override
    public String getMealType(){
        return "Vegan Meal";
    }
    @Override
    public void showMealDetails(){
        System.out.println("Dish: " + dishName + " | Type: Vegan");
    }
}
