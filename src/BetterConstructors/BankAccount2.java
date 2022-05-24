
package BetterConstructors;

/**
 *
 * @author guexa
 */
public class BankAccount2 {
    
    private double balance;
    private double interest;
    
/**
 * At this point the requeriments beign modified, and now you're noticed that
 * accounts may never be created with a negative balance or interest rate
 * - Create the same constructors better as possible with this condition
 */
    
    public BankAccount2() 
    {
        this(0);
    }

    public BankAccount2(double balance) 
    {
        this(balance, 0.01);
    }

    public BankAccount2(double balance, double interest) 
    {
        if(interest < 0)
        {
            throw new IllegalArgumentException("Interest rate can't be less than 0");
        }
        if(balance <0)
        {
            throw new IllegalArgumentException("Starting balance can't be less than 0");
        }
        
        this.balance = balance;
        this.interest = interest;
    }
}
