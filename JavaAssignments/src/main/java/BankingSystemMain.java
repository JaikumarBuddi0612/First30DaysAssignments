import BankingSystem.BankAccount;
import BankingSystem.BankOperations;
import BankingSystem.SavingAccount;
import BankingOutsidePackage.ExternalAudit;

public class BankingSystemMain {
    public static void main(String[] args){
        BankAccount acc= new BankAccount();
        SavingAccount sac= new SavingAccount(acc);
        sac.run();
        BankOperations bop= new BankOperations(acc);
        bop.run();
        ExternalAudit exa = new ExternalAudit(acc);
        exa.run();
    }
}
