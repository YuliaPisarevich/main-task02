package by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.exceptions;

public class NewYearGiftException extends Exception {

        public NewYearGiftException() {
        }

        public NewYearGiftException(String message) {
            super(message);
        }

        public NewYearGiftException(String message, Throwable cause) {
            super(message, cause);
        }

}
