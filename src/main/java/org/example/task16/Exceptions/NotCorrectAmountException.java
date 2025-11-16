package org.example.task16.Exceptions;

public class NotCorrectAmountException extends RuntimeException{
    private String errorCode;

    public NotCorrectAmountException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public NotCorrectAmountException(String message) {
        super(message);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
