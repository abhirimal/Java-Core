package oop.abstraction.question2;

public class MainClass {

   public static void main(String[] args){

       BankA a = new BankA(20);
       a.getBalance();

       BankB b = new BankB(40);
       b.getBalance();

       BankC  c = new BankC(35);
       c.getBalance();
   }
}
