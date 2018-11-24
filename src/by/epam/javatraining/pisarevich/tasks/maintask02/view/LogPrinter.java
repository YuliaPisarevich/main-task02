package by.epam.javatraining.pisarevich.tasks.maintask02.view;

import org.apache.log4j.Logger;

public class LogPrinter implements Printable {
    public static final Logger LOG = Logger.getRootLogger();



    @Override
    public void print(String result) {
        LOG.info("Result" + result);
    }

    public static void printError(String result){
        LOG.error("Result" + result);
    }
}
