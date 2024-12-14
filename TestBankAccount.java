public class TestBankAccount {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(2.5);
        account.setFirstName("John");
        account.setLastName("Doe");
        account.setAccountID(12345);
        account.deposit(1000.0);
        //account.processWithdrawal(1000.0);
        account.processWithdrawal(1500.00); //Overdraft tester
        account.displayAccount();
    }
}