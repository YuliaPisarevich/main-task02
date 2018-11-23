package by.epam.javatraining.pisarevich.tasks.maintask02.model.entity;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions.Sweets;

import java.util.Objects;

public class Candy extends Sweets {
    private String consist;


    public Candy() {
    }

    public Candy(String name, double weight, double cost, double calories, String consist) {
       super(name, weight, cost, calories);
        this.consist = consist;
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
}
