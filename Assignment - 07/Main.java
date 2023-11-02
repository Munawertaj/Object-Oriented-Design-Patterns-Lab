public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5);

        vendingMachine.insertDollar();
        vendingMachine.dispense();
        vendingMachine.ejectMoney();

        vendingMachine.insertDollar();
        vendingMachine.insertDollar();
        vendingMachine.dispense();
        vendingMachine.dispense();

        vendingMachine.insertDollar();
        vendingMachine.dispense();

        vendingMachine.insertDollar();
        vendingMachine.dispense();

        vendingMachine.insertDollar();
        vendingMachine.dispense();
    }
}
