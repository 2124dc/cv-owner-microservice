package com.app.cv.exception;

public class UserNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String errorCode;

    public UserNotFoundException(String message) {
        super(message);
        this.errorCode = "UNKNOWN_ERROR";
    }

    public UserNotFoundException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public UserNotFoundException(String message, Throwable cause, String errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}