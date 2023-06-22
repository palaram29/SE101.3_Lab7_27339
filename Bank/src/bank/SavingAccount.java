package bank;

public class SavingAccount extends BankAccount {
    private static final double saving_account_interest_rate=0.02;
    
    @Override
    public void calculateInterest()
    {
        double interest = getbalance()*saving_account_interest_rate;
        System.out.println("The interest for saving account: "+interest);
    }
    
}
