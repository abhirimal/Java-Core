package oop.abstraction.question2;

public class BankB extends Bank {

    private int balance;

    public BankB(int balance) {
        this.balance = balance;
    }

    @Override
    public void getBalance() {
        System.out.println("Bank B balance is : $ " + balance);
    }
}
