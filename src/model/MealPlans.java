package model;

public class MealPlans {
    private String mealPlan;
    private String priceForDay;

    public MealPlans() {
    }

    public MealPlans(String mealPlan, String priceForDay) {
        this.mealPlan = mealPlan;
        this.priceForDay = priceForDay;
    }

    public String getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    public String getPriceForDay() {
        return priceForDay;
    }

    public void setPriceForDay(String priceForDay) {
        this.priceForDay = priceForDay;
    }

    @Override
    public String toString() {
        return "MealPlans{" +
                "mealPlan='" + mealPlan + '\'' +
                ", priceForDay='" + priceForDay + '\'' +
                '}';
    }
}
