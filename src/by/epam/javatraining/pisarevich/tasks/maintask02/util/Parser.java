package by.epam.javatraining.pisarevich.tasks.maintask02.util;


import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.Candy;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.ChocolateBar;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.Lollipop;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions.Sweets;
import by.epam.javatraining.pisarevich.tasks.maintask02.view.LogPrinter;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Parser {

    public static List<Sweets> readInput(String fileName) {
        List<Sweets> sweetsList = new ArrayList<Sweets>();
        StringBuilder sb = new StringBuilder();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (true) {
                line = br.readLine();

                if ((line == null)) {
                    break;
                }
                int openingP = line.indexOf('(');
                int closingP = line.indexOf(')');
                String sweetsType = line.substring(0, openingP);
                Sweets sweets = null;
                switch (sweetsType) {
                    case "Candy":
                        sweets = new Candy();
                    case "Lollipop":
                        sweets = new Lollipop();
                    case "ChocolateBar":
                        sweets = new ChocolateBar();

                }
                HashMap<String, String> fields = null;
                try {
                    fields = parseFields(line.substring(openingP + 1, closingP));
                } catch (Exception e) {
                    LogPrinter.printError("Error readInput: wrong data");
                }
                if (sweets != null && fields != null && sweets.parseData(fields)) {
                    sweetsList.add(sweets);
                }

            }
        } catch (IOException e) {
            LogPrinter.printError("File " + fileName);
            System.exit(0);
        }

        return sweetsList;
    }
    //TODO доделать через  MAP
    static private HashMap<String, String> parseFields(String fieldsStr) throws Exception {
        HashMap<String, String> fields = new HashMap<String, String>();
        String[] pairs = fieldsStr.split(", ");
        for (String s : pairs) {
            String[] keyValue = s.split(":");
            if (keyValue.length == 2) {
                fields.put(keyValue[0], keyValue[1]);
            } else {
                throw new Exception("wrong data");
            }
        }
        return fields;
    }
}