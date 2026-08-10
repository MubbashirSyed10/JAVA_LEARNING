package Exceptions;

public class InsufficientBalanceException extends Exception{
    private String msg;
    public InsufficientBalanceException(String message, Throwable cause) {
        super(message, cause);
//        this.msg = message;
    }
}
