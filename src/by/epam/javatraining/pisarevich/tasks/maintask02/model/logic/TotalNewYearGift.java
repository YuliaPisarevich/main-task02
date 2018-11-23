package by.epam.javatraining.pisarevich.tasks.maintask02.model.logic;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions.Sweets;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.container.NewYearGift;

public class TotalNewYearGift {
    public static double calcTotalCost(NewYearGift newYearGift) {
        double total = 0;
        for (Sweets sweets : newYearGift.getSweets()) {
            total += sweets.getCost();
        }
        total += newYearGift.getCost();
        return total;
    }

    public static double calcTotalWeight(NewYearGift newYearGift) {
        double total = 0;
        for (Sweets sweets : newYearGift.getSweets()) {
            total += sweets.getWeight();
        }
        total += newYearGift.getWeight();
        return total;
    }
}
