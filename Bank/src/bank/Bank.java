package bank;

public class Bank {

    public static void main(String[] args) {
        SavingAccount save=new SavingAccount();
        save.setbalance(20000000);
        save.calculateInterest();
        
        CheckingAccount check=new CheckingAccount();
        check.setbalance(10000000);
        check.calculateInterest();
    }
    
}
