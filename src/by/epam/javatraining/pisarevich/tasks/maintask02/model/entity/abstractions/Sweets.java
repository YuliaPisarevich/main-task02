package by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions;

import by.epam.javatraining.pisarevich.tasks.maintask02.view.LogPrinter;

import java.util.Objects;

public class Sweets {
    private String name;
    private double weight;
    private double cost;
    private double calories;

    public Sweets() {
    }

    public Sweets(String name, double weight, double cost, double calories) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.calories = calories;
    }
    public Sweets(Sweets sweets) {
        this.name = sweets.name;
        this.weight = sweets.weight;
        this.cost = sweets.cost;
        this.calories = sweets.calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0){
            this.weight = weight;
        } else {
            LogPrinter.LOG.error("Weight cannot be negative or equals 0. ");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sweets)) return false;
        Sweets sweets = (Sweets) o;
        return  Double.compare(sweets.getWeight(), getWeight()) == 0 &&
                Double.compare(sweets.getCost(), getCost()) == 0 &&
                Double.compare(sweets.getCalories(), getCalories()) == 0 &&
                Objects.equals(getName(), sweets.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight(), getCost(), getCalories());
    }
}
