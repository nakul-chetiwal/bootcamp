package pack_Inheritance_encap_day3.pack_bank_account;

public class BankAccount {
    float balance;

    public BankAccount() {

    }

    public BankAccount(float balance) {
        this.balance = balance;
    }

    public String deposit(float amount) {
        balance = balance + amount;
        return "Amount: " + amount + " Euro has been deposited in your Bank Account";
    }

    public String withdraw(float amount) {
        balance = balance - amount;
        return "Amount: " + amount + " Euro has been withdraw from your Bank Account";
    }

    public void printBalance() {
        System.out.println("Your Current Balance is: " + balance + " Euro");
    }

    public void transferBalance(BankAccount obj1, float amt) {
        this.balance-= amt;
        obj1.balance+=amt;
        System.out.println("Amount: " + amt + " is transferred from bank Account 1 to bank account 2.");
        System.out.println("Current Balance in bank account 1 is : " + this.balance + " Euros.");
        System.out.println("Current Balance in bank account 2 is : " + obj1.balance + " Euros.");

    }
}
