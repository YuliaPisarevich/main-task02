package by.epam.javatraining.pisarevich.tasks.maintask02.controller;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions.Sweets;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.container.NewYearGift;
import by.epam.javatraining.pisarevich.tasks.maintask02.util.ParserFile;

import java.util.List;


/**
 * New Year Gift.
 *
 * @author Yulia Pisarevich
 */
public class Main {
    public static void main(String[] args) {

        //not done yet :(

        List<Sweets> sweetsList = ParserFile.readInput("present.txt");
        System.out.println(sweetsList.size());


        NewYearGift newYearGift = new NewYearGift(sweetsList);

    }
}
