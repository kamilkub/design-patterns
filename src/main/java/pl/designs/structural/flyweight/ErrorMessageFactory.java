package pl.designs.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {

    public enum ErrorType { GenericSystemError, PageNotFoundError, ServerError}

    private static final ErrorMessageFactory INSTANCE = new ErrorMessageFactory();

    private static final Map<ErrorType, ErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory() {
        errorMessages.put(ErrorType.ServerError, new SystemErrorMessage("Server error: $errorCode", "https://error.com"));
        errorMessages.put(ErrorType.PageNotFoundError, new SystemErrorMessage("Page not found: $errorCode", "https://error.com"));

    }

    public static String getErrorMessage(ErrorType type, String code) {
        return errorMessages.get(type).getText(code);
    }

    public static ErrorMessageFactory getInstance() {
        return INSTANCE;
    }



}
