public class HighProteinMeal implements MealPlan{
    private String dishName;
    public HighProteinMeal(String dishName){
        this.dishName = dishName;
    }
    @Override
    public String getMealType(){
        return "High Protein Meal";
    }
    @Override
    public void showMealDetails(){
        System.out.println("Dish: " + dishName + " | Type: High-Protein");
    }
}
