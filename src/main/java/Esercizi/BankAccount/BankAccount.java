package Esercizi.BankAccount;

public interface BankAccount
{
    String getIBAN();
    String getCountry();

    double withdraw(double amount);
    double transfer(BankAccount rx, double amount);
    void deposit(double amount);
    double addAnnualInterest();

}
