package by.epam.javatraining.pisarevich.tasks.maintask02.model.logic.extremumnewyeargift;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions.Sweets;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.container.NewYearGift;

public class ExtremumWeight {
    public static double findMinWeight(NewYearGift newYearGift) {

        double minWeight = 1000;
        for (Sweets sweets : newYearGift.getSweets()) {
            if (sweets.getWeight() < minWeight) {
                minWeight = sweets.getWeight();
            }
        }
        return minWeight;
    }

    public static double findMaxWeight(NewYearGift newYearGift) {
        double maxWeight = 0;
        for (Sweets sweets : newYearGift.getSweets()) {
            if (sweets.getWeight() > maxWeight) {
                maxWeight = sweets.getWeight();
            }
        }
        return maxWeight;
    }

    public static String findSweetsWithMinWeight(NewYearGift newYearGift) {

        double minWeight = 1000;
        Sweets sweetsMinWeight = null;

        for (Sweets sweets : newYearGift.getSweets()) {
            if (sweets.getWeight() < minWeight) {
                minWeight = sweets.getWeight();
                sweetsMinWeight = sweets;
            }
        }
        return sweetsMinWeight.toString();

    }

    public static String findSweetsWithMaxWeight(NewYearGift newYearGift) {

        double maxWeight = 0;
        Sweets sweetsMaxWeight = null;

        for (Sweets sweets : newYearGift.getSweets()) {
            if (sweets.getWeight() > maxWeight) {
                maxWeight = sweets.getWeight();
                sweetsMaxWeight = sweets;
            }
        }
        return sweetsMaxWeight.toString();

    }
}
