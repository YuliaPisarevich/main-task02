package by.epam.javatraining.pisarevich.tasks.maintask02.model.entity;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions.Sweets;

import java.util.Map;
import java.util.Objects;

public class ChocolateBar extends Sweets {
    private String typeOfChocolate;

    public ChocolateBar() {
    }

    public ChocolateBar(String name, double weight, double cost, double calories, String typeOfChocolate) {
        super(name, weight, cost, calories);
        this.typeOfChocolate = typeOfChocolate;

    }
    public ChocolateBar(ChocolateBar anotherChocolateBar){

        this(anotherChocolateBar.getName(), anotherChocolateBar.getWeight(),
                anotherChocolateBar.getCost(), anotherChocolateBar.getCalories(),
                   anotherChocolateBar.getTypeOfChocolate());
    }


    public String getTypeOfChocolate() {
        return typeOfChocolate;
    }

    public void setTypeOfChocolate(String typeOfChocolate) {
        this.typeOfChocolate = typeOfChocolate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChocolateBar)) return false;
        if (!super.equals(o)) return false;
        ChocolateBar that = (ChocolateBar) o;
        return Objects.equals(getTypeOfChocolate(), that.getTypeOfChocolate());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getTypeOfChocolate());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", typeOfChocolate=" + typeOfChocolate +
                '}';
    }
    @Override
    public boolean parseData(Map<String, String> data) {
        boolean baseFieldsParsed = super.parseData(data);
        if (baseFieldsParsed)
        {
            boolean allKeysPresent = data.containsKey("typeOfChocolate");
            if (allKeysPresent) {
                this.typeOfChocolate = data.get("typeOfChocolate");
                return true;
            }
        }
        return false;
    }
}
