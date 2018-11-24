package by.epam.javatraining.pisarevich.tasks.maintask02.util.exception;


public class WrongDataParseFieldException extends ParserException {

    public WrongDataParseFieldException() {
    }

    public WrongDataParseFieldException(String message) {
        super(message);
    }

    public WrongDataParseFieldException(String message, Throwable cause) {
        super(message, cause);
    }

}
