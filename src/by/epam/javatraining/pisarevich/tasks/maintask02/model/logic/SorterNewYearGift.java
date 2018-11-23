package by.epam.javatraining.pisarevich.tasks.maintask02.model.logic;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.container.NewYearGift;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions.Sweets;

import java.util.Comparator;

public class SorterNewYearGift {
    public static NewYearGift sortByCost(NewYearGift newYearGift){
        newYearGift.getSweets().sort(Comparator.comparing(Sweets::getCost));

        return newYearGift;
    }

    public static NewYearGift sortByWeight(NewYearGift newYearGift){
        newYearGift.getSweets().sort(Comparator.comparing(Sweets::getWeight));

        return newYearGift;
    }
}