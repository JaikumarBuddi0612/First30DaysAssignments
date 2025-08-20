package BankingSystem;

public class SavingAccount extends BankAccount{
    BankAccount acc;
    public SavingAccount(BankAccount acc){
        this.acc=acc;
    }
    public void run(){
        System.out.println("saving account running.....");
        System.out.println(acc.accountType);
        System.out.println(acc.accountHolderName);
        System.out.println(acc.getBalance());;
        System.out.println(acc.getMaskedAccountNumber());
        acc.deposit(100);
        acc.withdraw(100);
    }
}
