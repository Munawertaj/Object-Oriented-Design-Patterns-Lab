public class Main {
    public static void main(String[] args) {
        // Create a vending machine with an initial stock of 5 products
        VendingMachine vendingMachine = new VendingMachine(5);

        // Simulate various actions and state transitions
        System.out.println("Vending Machine Simulation:");

        // Initial state: Idle
        System.out.println("Current State: Idle");
        vendingMachine.insertDollar();  // Inserting a dollar

        // State transition to HasOneDollarState
        System.out.println("\nCurrent State: HasOneDollarState");
        vendingMachine.dispense();  // Dispensing a product
        vendingMachine.ejectMoney(); // Ejecting money

        // State transition back to Idle
        System.out.println("\nCurrent State: Idle");
        vendingMachine.insertDollar();  // Inserting a dollar

        // State transition to HasOneDollarState again
        System.out.println("\nCurrent State: HasOneDollarState");
        vendingMachine.insertDollar();  // Inserting another dollar
        vendingMachine.dispense();  // Dispensing a product

        // State transition to OutOfStockState
        System.out.println("\nCurrent State: OutOfStockState");
        vendingMachine.dispense();  // Attempting to dispense (out of stock)

        // State remains OutOfStockState
        System.out.println("\nCurrent State: OutOfStockState");
        vendingMachine.insertDollar();  // Attempting to insert a dollar

        // State remains OutOfStockState
        System.out.println("\nCurrent State: OutOfStockState");
        vendingMachine.ejectMoney();  // Attempting to eject money

        // Note: You can continue testing other scenarios and state transitions here.

        System.out.println("\nSimulation Complete.");
    }
}
