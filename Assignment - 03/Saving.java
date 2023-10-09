
public class Saving implements IAccount {
    private int accountNumber;
    private int balance;

    public Saving(int accountNumber, int amount) {
        this.accountNumber = accountNumber;
        this.balance = amount;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient Balance!!!");
    }

    @Override
    public void transfer(IAccount toAccount, int amount) {
        withdraw(amount);
        toAccount.deposit(amount);
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    public int showBalance() {
        return balance;
    }
}
