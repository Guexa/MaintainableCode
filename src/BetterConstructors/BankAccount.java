
package BetterConstructors;

/**
 *
 * @author guexa
 */
public class BankAccount {
    
    private double balance;
    private double interest;

/**
 * DRY (Don't repeat yourself) example:
 * as the requeriments of this excercise we need to create better constructors
 * 1- Default null argument
 * 2- A starting balance
 * 3- Some accounts have interest rate attached to them
 */
    
    public BankAccount() {}

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }
}
