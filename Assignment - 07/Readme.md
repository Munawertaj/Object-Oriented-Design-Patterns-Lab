# Vending Machine State Design Pattern

This Java program demonstrates the implementation of the state design pattern for a vending machine functionality. A vending machine has several states and specific actions based on those states. This code represents the vending machine's behavior using the state design pattern.

## States

The vending machine has three states:

1. **IdleState**: This state represents the initial state of the vending machine. It waits for the user to insert a dollar.

2. **HasOneDollarState**: This state is reached when a dollar is inserted. In this state, the user can either make a product selection, eject money, or the machine dispenses a product.

3. **OutOfStockState**: This state is entered when the vending machine is out of stock. In this state, the machine does not respond to product selections or money insertion.

## Actions

The vending machine supports the following actions:

- Inserting a dollar: The user can insert a dollar, which changes the machine's state.
- Ejecting money: The user can request the machine to return the inserted money.
- Dispensing a product: When a selection is made and the machine has the product in stock, it dispenses the product and may return to the idle state.

## Usage

1. Compile all the Java files in your favorite IDE or using the command line.

2. Run the `Main.java` file to test the vending machine's behavior.

3. The program will simulate the vending machine's states and actions, showing the output in the console.

## Files

- `State.java`: Interface defining the state methods.
- `IdleState.java`: Implementation of the idle state.
- `HasOneDollarState.java`: Implementation of the state when one dollar is inserted.
- `OutOfStockState.java`: Implementation of the out of stock state.
- `VendingMachine.java`: Vending machine class that manages states and actions.
- `Main.java`: The main class to run and test the vending machine.
