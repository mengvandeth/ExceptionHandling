package Problemtwo;

public class CustomerAccount {
    private String Cus_name;
    private String Acc_No;
    private double Balance;


    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        Balance += amount;
        return true;
    }

    public boolean withdraw(double amount) throws InSufficientBalanceException {
        if (amount <= 0) {
            return false;
        }
        if(Balance < 100){
            throw new InSufficientBalanceException("Balance is not sufficient for this transaction");
        }
        boolean isValidBalanceRange = getBalance() - amount < 100;
        if (amount > Balance || isValidBalanceRange) {
            throw new InSufficientBalanceException("Balance is not sufficient for this transaction");
        }
        Balance -= amount;
        return true;
    }

    public double getBalance() {

        return Balance;
    }
}
