package by.epam.javatraining.pisarevich.tasks.maintask02.util;


import by.epam.javatraining.pisarevich.tasks.maintask02.view.LogPrinter;

import java.io.*;
import java.util.Scanner;

//
//public class Parser {
//    public static String readInput(String nameFile) {
//
//        Scanner scanner = null;
//        try {
//            scanner = new Scanner(new File(nameFile));
//
//
//        } catch (FileNotFoundException e) {
//            LogPrinter.printError("File " + nameFile);
//            System.exit(0);
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        while (scanner.hasNextLine()){
//            stringBuilder.append(scanner.nextLine());
//        }
//        return stringBuilder.toString();
//    }
//
//}
public class Parser {

    public static String readInput(String fileName) {
        StringBuilder sb = new StringBuilder();
        String line ;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//            int i = 0;
            while (true){
                line = br.readLine();

                if ((line == null)) {
                    break;
                }
                sb.append(line).append(";");

//                i++;

            }
        } catch (IOException e) {
            LogPrinter.printError("File " + fileName);
            System.exit(0);
        }

        return sb + "";
    }

}