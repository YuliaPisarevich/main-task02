package by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.container;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions.Sweets;

import java.util.ArrayList;
import java.util.List;

public class NewYearGift {
    private List<Sweets> sweets;
    private double costBox;
    private double weightBox;

    public NewYearGift() {
        sweets = new ArrayList<>();
    }

    public NewYearGift(List<Sweets> sweets) {
        this.sweets = sweets;
    }
    public NewYearGift(NewYearGift newYearGift){
        this(newYearGift.getSweets());
    }
    public List<Sweets> getSweets() {
        return sweets;
    }

    public void setSweets(List<Sweets> sweets) {
        this.sweets = sweets;
    }

    public void add(Sweets... sweets) {
        for (Sweets sw : sweets) {
            this.sweets.add(sw);
        }
    }

    public double getCostBox() {
        return costBox;
    }

    public void setCostBox(double costBox) {
        this.costBox = costBox;
    }

    public double getWeightBox() {
        return weightBox;
    }

    public void setWeightBox(double weightBox) {
        this.weightBox = weightBox;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List: \n");
        for (Sweets sweets : sweets) {
            builder.append(sweets.toString()).append("\n");
        }

        return builder + "";
    }
}

