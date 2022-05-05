package view.tm;

import javafx.scene.control.Button;

import java.awt.*;

public class MealPlansTM {
    private String mealPlan;
    private String priceForDay;
    private Button btn;

    public MealPlansTM(String mealPlan, String priceForDay) {
    }

    public MealPlansTM(String mealPlan, String priceForDay, Button btn) {
        this.mealPlan = mealPlan;
        this.priceForDay = priceForDay;
        this.btn = btn;
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

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "MealPlansTM{" +
                "mealPlan='" + mealPlan + '\'' +
                ", priceForDay='" + priceForDay + '\'' +
                ", btn=" + btn +
                '}';
    }
}
