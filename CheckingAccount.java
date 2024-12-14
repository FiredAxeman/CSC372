public class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double amount) {
        if (getBalance() >= amount) {
            super.withdrawal(amount);
        } else {
            double overdraftFee = 30.0;
            System.out.println( "Balance: $" + (amount - getBalance()));
            super.withdrawal(amount + overdraftFee);
            System.out.println("Overdraft fee: $" + overdraftFee);
        }
    }

    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


