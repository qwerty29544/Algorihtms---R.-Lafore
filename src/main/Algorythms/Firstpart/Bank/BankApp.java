package Algorythms.Firstpart.Bank;

public class BankApp {
    public static void main(String[] args)
    {
        BankAccount ba1 = new BankAccount(100.00); // Создание счета
        System.out.print("Before transactions, ");
        ba1.display(); // Вывод баланса
        ba1.deposit(74.35); // Внесение средств
        ba1.withdraw(20.00); // Снятие средств
        System.out.print("After transactions, ");
        ba1.display(); // Вывод баланса
    }
}
