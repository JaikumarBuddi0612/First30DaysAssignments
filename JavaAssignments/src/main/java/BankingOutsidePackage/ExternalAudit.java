package BankingOutsidePackage;


import BankingSystem.BankAccount;

public class ExternalAudit {
    BankAccount acc;
    public ExternalAudit(BankAccount acc){
        this.acc=acc;
    }
    public void run(){
        System.out.println("External audit class is running......");
        System.out.println(acc.accountHolderName);
        acc.deposit(100);
        acc.withdraw(100);
    }
}
