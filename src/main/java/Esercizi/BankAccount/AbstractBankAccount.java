package Esercizi.BankAccount;

public abstract class AbstractBankAccount implements BankAccount
{
    String IBAN;
    double balance;

    public AbstractBankAccount(String IBAN, double balance)
    {
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public String getIBAN()
    {
        return this.IBAN;
    }

    public String getCountry()
    {
        return this.IBAN.substring(0, 2);
    }

}
