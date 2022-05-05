package view.tm;

public class SelectedMealPlansTM {
    private String mealPlan;
    private int breakfasts;
    private int lunches;
    private int dinners;
    private int price;

    public SelectedMealPlansTM() {
    }

    public SelectedMealPlansTM(String mealPlan, int breakfasts, int lunches, int dinners, int price) {
        this.mealPlan = mealPlan;
        this.breakfasts = breakfasts;
        this.lunches = lunches;
        this.dinners = dinners;
        this.price = price;
    }

    public String getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    public int getBreakfasts() {
        return breakfasts;
    }

    public void setBreakfasts(int breakfasts) {
        this.breakfasts = breakfasts;
    }

    public int getLunches() {
        return lunches;
    }

    public void setLunches(int lunches) {
        this.lunches = lunches;
    }

    public int getDinners() {
        return dinners;
    }

    public void setDinners(int dinners) {
        this.dinners = dinners;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SelectedMealPlansTM{" +
                "mealPlan='" + mealPlan + '\'' +
                ", breakfasts=" + breakfasts +
                ", lunches=" + lunches +
                ", dinners=" + dinners +
                ", price=" + price +
                '}';
    }
}
