package pack_Inheritance_encap_day3.pack_bank_account;

public class Main {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1000);
        BankAccount b2 = new BankAccount(2000);
        System.out.println(b1.deposit(100));
        System.out.println(b1.withdraw(200));
        b1.printBalance();
        b1.transferBalance(b2, 100);

        System.out.println("XXXXXX  Updated Bank Deposit class output below XXXXX");
        UpdatedBankAccount b3 = new UpdatedBankAccount(1000);
        UpdatedBankAccount b4 = new UpdatedBankAccount();
        b4.setBalance(2000);

        b3.deposit(10000);
        b3.withdraw(25000);
        b3.printBalance();
        b3.transferBalance(b4, 500000);

    }
}
