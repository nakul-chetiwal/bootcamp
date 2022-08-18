package pack_Inheritance_encap_day3.pack_bank_account;

public class UpdatedBankAccount {
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public UpdatedBankAccount() {

    }

    public UpdatedBankAccount(float balance) {
        this.balance = balance;
    }

    public void deposit(float amount) {
        if (amount < 5000 && amount > 0 ) {
            this.balance += amount;
            System.out.println("Amount: " + amount + " Units has been deposited in your Bank Account");
        } else {
            System.out.println("Transaction canceled incorrect amount. Max deposit - 5000  | Your deposit: " + amount + " units");
        }


    }

    public void withdraw(float amount) {
        if (balance < amount)
            System.out.println("There is not enough funds for withdrawal.");
        else {
            balance = balance - amount;
            System.out.println("Amount: " + amount + " Units has been withdraw from your Bank Account. Current balance: " + this.getBalance() + " Units");
        }
    }

    public void printBalance() {
        System.out.println("Your Current Balance is: " + this.getBalance() + " Units");
    }

    public void transferBalance(UpdatedBankAccount transfer_to, float amt) {
        if (transfer_to.getBalance() < amt)
            System.out.println("Transfer canceled. You are trying to transfer " + amt + " units, but only " + transfer_to.balance + " units are available.");
        else {
            this.balance -= amt;
            transfer_to.balance += amt;
            System.out.println("Amount: " + amt + " is transferred from bank Account 1 to bank account 2.");
            System.out.println("Current Balance in bank account 1 is : " + this.getBalance() + " Units.");
            System.out.println("Current Balance in bank account 2 is : " + transfer_to.getBalance() + " Units.");
        }

    }
}
