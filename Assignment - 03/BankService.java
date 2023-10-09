import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer, IAccount> bankAccounts;
    private int nextAccountNumber;

    public BankService() {
        this.bankAccounts = new Hashtable<>();
        this.nextAccountNumber = 0;
    }

    public int createNewAccount(String type, int initialAmount) {
        IAccount newAccount = null;
        nextAccountNumber += 1;

        switch (type.toLowerCase()) {
            case "chequing":
                newAccount = new Chequing(nextAccountNumber, initialAmount);
                break;
            case "saving":
                newAccount = new Saving(nextAccountNumber, initialAmount);
                break;
            case "investment":
                newAccount = new Investment(nextAccountNumber, initialAmount);
                break;
            default:
                System.out.println("Invalid Account type");
                break;
        }

        if (newAccount != null) {
            bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }

        return -1;
    }

    public void transferMoney(int to, int from, int amount) {
        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);

        if (toAccount != null && fromAccount != null) {
            fromAccount.transfer(toAccount, amount);
        } else {
            System.out.println("Invalid account numbers.");
        }
    }

    public void deposit(int accountNumber, int amount) {
        IAccount account = this.bankAccounts.get(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(int accountNumber, int amount) {
        IAccount account = this.bankAccounts.get(accountNumber);
        account.withdraw(amount);
    }

    public int showBalance(int accountNumber) {
        IAccount account = this.bankAccounts.get(accountNumber);
        int currentBalance = account.showBalance();
        return currentBalance;
    }
}
