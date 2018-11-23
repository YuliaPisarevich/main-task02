package by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.exceptions;


public class SweetsNotFoundException extends NewYearGiftException {

    public SweetsNotFoundException() {
    }

    public SweetsNotFoundException(String message) {
        super(message);
    }

    public SweetsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
