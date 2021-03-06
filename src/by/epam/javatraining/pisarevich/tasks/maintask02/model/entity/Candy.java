package by.epam.javatraining.pisarevich.tasks.maintask02.model.entity;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions.Sweets;

import java.util.Map;
import java.util.Objects;

public class Candy extends Sweets {
    private String consist;


    public Candy() {
    }

    public Candy(String name, double weight, double cost, double calories, String consist) {
       super(name, weight, cost, calories);
        this.consist = consist;
    }


public Candy(Candy anotherCandy) {
    this(anotherCandy.getName(), anotherCandy.getWeight(), anotherCandy.getCost(),
            anotherCandy.getCalories(),anotherCandy.getConsist());
}



    public String getConsist() {
        return consist;
    }

    public void setConsist(String consist) {
        this.consist = consist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candy)) return false;
        Candy candy = (Candy) o;
        return Objects.equals(getConsist(), candy.getConsist());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getConsist());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", consist=" + consist +
                '}';
    }

    @Override
    public boolean parseData(Map<String, String> data) {
        boolean baseFieldsParsed = super.parseData(data);
        if (baseFieldsParsed) {
            boolean allKeysPresent = data.containsKey("consist");
            if (allKeysPresent) {
                this.consist = data.get("consist");
                return true;
            }
        }
        return false;
    }
}
