package BankingSystem;

public class BankOperations {
    BankAccount acc;
    public BankOperations(BankAccount acc){
        this.acc= acc;
    }
    public void run(){
        System.out.println("Bankoperations is running.....");
        System.out.println(acc.getMaskedAccountNumber());
        System.out.println(acc.getBalance());
        System.out.println(acc.accountType);
        acc.deposit(100);
        acc.withdraw(100);
    }
}
