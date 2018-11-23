package by.epam.javatraining.pisarevich.tasks.maintask02.model.logic.extremumnewyeargift;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions.Sweets;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.container.NewYearGift;

public class ExtremumCost {
    public static double findMinCost(NewYearGift newYearGift) {

        double minCost = 1000;
        for (Sweets sweets : newYearGift.getSweets()) {
            if (sweets.getCost() < minCost) {
                minCost = sweets.getCost();
            }
        }
        return minCost;
    }

    public static double findMaxCost(NewYearGift newYearGift) {
        double maxCost = 0;
        for (Sweets sweets : newYearGift.getSweets()) {
            if (sweets.getCost() > maxCost) {
                maxCost = sweets.getCost();
            }
        }
        return maxCost;
    }

    public static String findSweetsWithMinCost(NewYearGift newYearGift) {

        double minCost = 1000;
        Sweets sweetsMinCost = null;

        for (Sweets sweets : newYearGift.getSweets()) {
            if (sweets.getCost() < minCost) {
                minCost = sweets.getCost();
                sweetsMinCost = sweets;
            }
        }
        return sweetsMinCost.toString();

    }

    public static String findSweetsWithMaxCost(NewYearGift newYearGift) {

        double maxCost = 0;
        Sweets sweetsMaxCost = null;

        for (Sweets sweets : newYearGift.getSweets()) {
            if (sweets.getCost() > maxCost) {
                maxCost = sweets.getCost();
                sweetsMaxCost = sweets;
            }
        }
        return sweetsMaxCost.toString();

    }
}
