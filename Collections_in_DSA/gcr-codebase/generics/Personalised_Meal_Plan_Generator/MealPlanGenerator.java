interface MealPlan {
    void showMeal();
}

class VegetarianMeal implements MealPlan {

    public void showMeal() {
        System.out.println("Vegetarian Meal");
    }
}

class VeganMeal implements MealPlan {

    public void showMeal() {
        System.out.println("Vegan Meal");
    }
}

class KetoMeal implements MealPlan {

    public void showMeal() {
        System.out.println("Keto Meal");
    }
}

class Meal<T extends MealPlan> {

    T meal;

    Meal(T meal) {
        this.meal = meal;
    }

    void display() {
        meal.showMeal();
    }
}

public class MealPlanGenerator {

    static <T extends MealPlan> void generateMeal(T meal) {
        meal.showMeal();
    }

    public static void main(String args[]) {

        Meal<VegetarianMeal> m1 =
                new Meal<>(new VegetarianMeal());

        Meal<VeganMeal> m2 =
                new Meal<>(new VeganMeal());

        m1.display();
        m2.display();

        generateMeal(new KetoMeal());
    }
}