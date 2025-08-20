package BankingSystem;

public class BankAccount {
    private String accountNumber="anything";
    private double balance=1000;
    protected String accountType="anytype";
    public String accountHolderName="something";
    public void deposit(double amount){
        this.balance+=amount;
    }
    public void withdraw(double amount){
        if(this.balance<amount){
            return;
        }
        this.balance-=amount;
    }
    private void logTransaction(String type, double amount){
        System.out.println(type + amount);
    }
    protected double getBalance(){
        return this.balance;
    }
    String getMaskedAccountNumber() {
        return this.accountNumber;
    }
}
