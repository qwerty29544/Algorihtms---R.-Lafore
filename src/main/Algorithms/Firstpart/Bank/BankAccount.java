package Algorithms.Firstpart.Bank;

public class BankAccount {
    private double balance; // Баланс счета
    public BankAccount(double openingBalance) // Конструктор
    {
        balance = openingBalance;
    }
    public void deposit(double amount) // Внесение средств
    {
        balance = balance + amount;
    }
    public void withdraw(double amount) // Снятие средств
    {
        balance = balance - amount;
    }
    public void display() // Вывод баланса
    {
        System.out.println("balance=" + balance);
    }
}
