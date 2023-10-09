public class Customer {
    public static void main(String[] args) {

        System.out.println("\n------------  Welcome to the Banking Service ------------\n");
        
        BankService bankService = new BankService();

        int savings = bankService.createNewAccount("saving", 1000);
        int savingsBalance = bankService.showBalance(savings);
        int investment = bankService.createNewAccount("investment", 2000);
        int investmentBalance = bankService.showBalance(investment);

        System.out.println("\n------------  After Creating Savings and Investment Account  ------------\n");
        System.out.println("Savings Account Balance is: " + savingsBalance);
        System.out.println("Investment Account Balance is: " + investmentBalance);

        bankService.transferMoney(investment, savings, 500);
        investmentBalance = bankService.showBalance(investment);
        savingsBalance = bankService.showBalance(savings);

        System.out.println("\n------------  After Transferring Money  ------------\n");
        System.out.println("Savings Account Balance is: " + savingsBalance);
        System.out.println("Investment Account Balance is: " + investmentBalance);

        
        bankService.deposit(savings, 5000);
        savingsBalance = bankService.showBalance(savings);

        System.out.println("\n------------  After Depositing Money  ------------\n");
        System.out.println("Savings Account Balance is: " + savingsBalance);
    }
}
