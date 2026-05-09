package Exceptions;

public class BankAccount {
    private double balance;
    public BankAccount(double amount){
        this.balance = balance;
    }

    public void withdraw(double amount) throws CustomException{
        if(amount > balance){
            throw new CustomException();
        }
        balance -= amount;
    }
}
