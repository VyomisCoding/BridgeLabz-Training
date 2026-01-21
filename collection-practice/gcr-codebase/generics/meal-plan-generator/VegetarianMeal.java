public class VegetarianMeal implements MealPlan{
    private String dishName;
    public VegetarianMeal(String dishName){
        this.dishName = dishName;
    }
    @Override
    public String getMealType(){
        return "Vegetarian Meal";
    }
    @Override
    public void showMealDetails(){
        System.out.println("Dish: " + dishName + " | Type: Vegetarian");
    }
}
