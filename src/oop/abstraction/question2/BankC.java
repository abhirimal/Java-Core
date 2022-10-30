package oop.abstraction.question2;

public class BankC extends Bank {

    private int balance;

    public BankC(int balance) {
        this.balance = balance;
    }

    @Override
    public void getBalance() {
        System.out.println("Bank C balance is : $ " + balance);
    }
}
