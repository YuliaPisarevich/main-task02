package by.epam.javatraining.pisarevich.tasks.maintask02.util;


import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.Candy;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.ChocolateBar;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.Lollipop;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions.Sweets;
import by.epam.javatraining.pisarevich.tasks.maintask02.util.exception.ParserFileException.wrongdataparserexception.WrongDataParseFieldException;
import by.epam.javatraining.pisarevich.tasks.maintask02.util.exception.ParserFileException.wrongdataparserexception.WrongKeyReadInputException;
import by.epam.javatraining.pisarevich.tasks.maintask02.view.LogPrinter;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ParserFile {

    public static List<Sweets> readInput(String fileName) {
        List<Sweets> sweetsList = new ArrayList<Sweets>();
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


                try {
                    sweets = keySwitchSweets(sweetsType);
                } catch (WrongKeyReadInputException e){
                    LogPrinter.printError("Error readInput: WrongKeyReadInputException");
                }


                HashMap<String, String> fields = null;
                try {
                    fields = parseFields(line.substring(openingP + 1, closingP));
                } catch (WrongDataParseFieldException e) {
                    LogPrinter.printError("Error readInput: WrongData");
                }


                if (sweets != null && fields != null ) {
                    sweetsList.add(sweets);
                }

            }
        } catch (IOException e) {
            LogPrinter.printError("FileNotFound " + fileName);
            System.exit(0);
        }

        return sweetsList;
    }

    private static Sweets keySwitchSweets(String sweetsType) throws WrongKeyReadInputException{
        Sweets sweets;
        switch (sweetsType) {
            case "Candy":
                sweets = new Candy(); break;
            case "Lollipop":
                sweets = new Lollipop(); break;
            case "ChocolateBar":
                sweets = new ChocolateBar(); break;
            default: throw new WrongKeyReadInputException();
        }
      return sweets;
    }


    //TODO доделать через  MAP
    static private HashMap<String, String> parseFields(String fieldsStr) throws WrongDataParseFieldException {
        HashMap<String, String> fields = new HashMap<>();
        String[] pairs = fieldsStr.split(", ");
        for (String s : pairs) {
            String[] keyValue = s.split(":");
            if (keyValue.length == 2) {
                fields.put(keyValue[0], keyValue[1]);
            }
            else {
                throw new WrongDataParseFieldException("WrongData in parseFields");
            }
        }
        return fields;
    }
}