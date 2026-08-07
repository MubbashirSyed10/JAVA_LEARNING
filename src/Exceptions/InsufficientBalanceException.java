package Exceptions;

public class InsufficientBalanceException extends Exception{
    private String msg;
    public InsufficientBalanceException(String message) {
        super(message);
//        this.msg = message;
    }
}
