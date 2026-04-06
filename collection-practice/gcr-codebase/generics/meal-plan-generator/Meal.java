import java.util.ArrayList;
import java.util.List;

public class Meal<T extends MealPlan>{     // Generic Class -> Only MealPlan subtypes allowed
    private List<T> mealList = new ArrayList<>();
    public void addMeal(T meal){
        mealList.add(meal);
    }
    public List<T> getMeals(){
        return mealList;
    }
}
