package by.epam.javatraining.pisarevich.tasks.maintask02.controller;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.Candy;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.ChocolateBar;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.Lollipop;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.container.NewYearGift;

import static by.epam.javatraining.pisarevich.tasks.maintask02.model.logic.extremumnewyeargift.ExtremumCost.findMinCost;

/**
 * New Year Gift.
 *
 * @author Yulia Pisarevich
 */
public class Main {
    public static void main(String[] args) {

        //not done yet :(

        Candy candy = new Candy("Sweet", 20.0, 50.0, 5.0, "");
        ChocolateBar chocolateBar = new ChocolateBar("Choch", 100.0, 110.0, 10.0, "white");
        Lollipop lollipop = new Lollipop("Loli", 10.0, 1.0, 2.0, "apple");

        NewYearGift newYearGift = new NewYearGift();
        newYearGift.add(candy);
        newYearGift.add(lollipop);
        newYearGift.add(chocolateBar);

        double min = findMinCost(newYearGift);
        System.out.println(min);
    }
}
