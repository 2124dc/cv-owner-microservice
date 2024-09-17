package com.app.cv.exception;

public class UserAlreadyExistException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String errorCode;

    public UserAlreadyExistException(String message) {
        super(message);
        this.errorCode = "UNKNOWN_ERROR";
    }

    public UserAlreadyExistException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public UserAlreadyExistException(String message, Throwable cause, String errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}