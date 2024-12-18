package Problemtwo;

public class CustomerAccountTest {

    public static void main(String[] args) throws InSufficientBalanceException {
        CustomerAccount account = new CustomerAccount();
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Deposit status: " + account.deposit(500));
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Withdraw status: " + account.withdraw(300));
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Withdraw status: " + account.withdraw(100));
        System.out.println("Balance: " + account.getBalance());
    }
}
