package by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.container;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions.Sweets;

import java.util.ArrayList;
import java.util.List;

public class NewYearGift {
    private List<Sweets> sweets;
    private double cost;
    private double weight;

    public NewYearGift() {
        sweets = new ArrayList<>();
    }
    public NewYearGift(List<Sweets> sweets) {
        this.sweets = sweets;
    }

    public List<Sweets> getSweets() {
        return sweets;
    }

    public void setSweets(List<Sweets> sweets) {
        this.sweets = sweets;
    }
    public void add(Sweets... sweets){
        for (Sweets sw : sweets ) {
            this.sweets.add(sw);
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

