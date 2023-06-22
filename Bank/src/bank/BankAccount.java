package bank;

public abstract class BankAccount {
    private int accountNumber;
    private double balance;
    
    public int getaccountNumber()
    {
        return accountNumber;
    }
    
    public void setaccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public double getbalance()
    {
        return balance;
    }
    
    public void setbalance(double balance)
    {
        this.balance=balance;
    }
    
public abstract void calculateInterest();
}
 