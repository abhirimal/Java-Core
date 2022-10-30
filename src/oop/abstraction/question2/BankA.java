package oop.abstraction.question2;

public class BankA extends Bank {

    private int balance;

    public BankA(int balance) {
        this.balance = balance;
    }

    @Override
    public void getBalance() {
        System.out.println("Bank A balance is : $ " + balance);
    }
}
