package bank;

public class CheckingAccount extends BankAccount {
    private static final double checking_account_interest_rate=0.12;
    
    @Override
    public void calculateInterest()
    {
        double interest = getbalance()*checking_account_interest_rate;
        System.out.println("The interest for saving account: "+interest);
        
    }
    
    
}
