package com.constructorsandaccessmodifiers.level1;

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displayAccountDetails() {
        System.out.println(
            "Account Number: " + accountNumber +   // public
            ", Account Holder: " + accountHolder + // protected
            ", Balance: ₹" + getBalance() +         // private via getter
            ", Interest Rate: " + interestRate + "%"
        );
    }

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(
            "ACC12345",
            "Aryaman",
            10000.0,
            4.5
        );

        account.displayAccountDetails();

        account.deposit(2000);
        account.withdraw(1500);

        System.out.println("Updated Balance: ₹" + account.getBalance());
    }
}
