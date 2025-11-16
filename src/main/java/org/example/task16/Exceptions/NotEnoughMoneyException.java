package org.example.task16.Exceptions;

public class NotEnoughMoneyException extends RuntimeException {
    private String errorCode;

    public NotEnoughMoneyException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public NotEnoughMoneyException(String message) {
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
/*
4. Создать своё непроверяемое исключение NotEnoughMoneyException. В этом классе добавьте поле String errorCode, переопределите гетеры и сетеры.
 */