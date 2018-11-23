package by.epam.javatraining.pisarevich.tasks.maintask02.controller;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.Candy;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.ChocolateBar;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.Lollipop;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions.Sweets;
import by.epam.javatraining.pisarevich.tasks.maintask02.util.Parser;

import java.util.List;


/**
 * New Year Gift.
 *
 * @author Yulia Pisarevich
 */
public class Main {
    public static void main(String[] args) {

        //not done yet :(

        List<Sweets> sweetsList = Parser.readInput("present.txt");
        System.out.println(sweetsList.size());
    }
}
