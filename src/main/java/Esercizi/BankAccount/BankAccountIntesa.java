package Esercizi.BankAccount;

public class BankAccountIntesa extends AbstractBankAccount
{
    static final double FeeDeposit = 0;
    static final double FeeWithdraw = 0;
    static final double AnnualInterest = 0;

    public BankAccountIntesa(String IBAN, double amount)
    {
        super(IBAN, amount);
    }

    @Override
    public double withdraw(double amount)
    {
        if((this.balance - (amount*this.FeeWithdraw + amount)) >= 0)
        {
            this.balance = this.balance - (amount*this.FeeWithdraw + amount);
            return amount;
        }

        return -1;
    }

    @Override
    public double transfer(BankAccount rx, double amount)
    {
        if(this.getCountry() == rx.getCountry())
        {
            this.withdraw(amount);
            rx.deposit(amount);

            return amount;
        }

        return -1;
    }

    @Override
    public void deposit(double amount)
    {
        this.balance += amount - this.FeeDeposit*amount;

        return;
    }

    @Override
    public double addAnnualInterest()
    {
        double amount = this.balance*this.AnnualInterest;
        this.balance += amount;

        return amount;
    }

    @Override
    public String toString() {
        return "BankAccountIntesa{" +
                "IBAN='" + IBAN + '\'' +
                ", balance=" + balance +
                '}';
    }
}
