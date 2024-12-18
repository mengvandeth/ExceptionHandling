package Problemtwo;

import java.util.InputMismatchException;

public class CustomerAccount {
    private String cus_name;
    private String acc_no;
    private double balance;
    CustomerAccount(String name, String accNo, double balance){
        this.cus_name = name;
        this.acc_no = accNo;
        this.balance = balance;
    }
    public boolean deposit (double amount){
        try {
            if (amount<0) throw new InputMismatchException("Deposit must be greater than 0.");
            else {
                    balance += amount;
                    System.out.println("Your deposit " + amount + " successfully...");
                    return true;
            }

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean withdraw(double amount){
        try {
        if (amount > balance) throw new UnsupportedOperationException("You do not have enough balance.");
        else {
              balance = balance - amount;
              System.out.println("Withdraw "+ amount +" successfully...");
              return true;
        }
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public double getBalance(){
        try {
            if(balance<100) throw new Exception("Balance is less than 100, please deposit !");
            else{
                return balance;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return balance;
        }
    }

    public static void main(String[] args) {
        CustomerAccount acc1 = new CustomerAccount("Joe","Biden",10000);
        acc1.deposit(1000);
        System.out.println("your balance is : "+ acc1.getBalance());
        acc1.withdraw(1000);
        System.out.println("your  balance is : "+ acc1.getBalance());
        acc1.withdraw(9950);
        System.out.println("your  balance is : "+ acc1.getBalance());
    }
}
