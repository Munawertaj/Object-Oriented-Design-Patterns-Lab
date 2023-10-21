# Order Fulfillment System

This code demonstrates an Order Fulfillment system using the Proxy Pattern.

## Code Structure

- `Warehouse.java`: Represents a warehouse and handles order fulfillment.
- `Item.java`: Defines an item with a SKU(Stock Keeping Unit).
- `Order.java`: Represents an order with a list of items.
- `IOrder.java`: Interface for order fulfillment.
- `OrderFulfillmentProxy.java`: Proxy for order fulfillment, routing orders to appropriate warehouses.
- `OrderFulfillment.java`: Original order fulfillment system that routes orders to all available warehouses.
- `Main.java`: Contains the main method to run the code, initializes warehouses, and fulfills orders.

## Usage

1. Initialize the stock levels for warehouses in the `Main.java` file.
2. Run the `Main` class to see the order fulfillment process.

## License

This code is provided under the MIT License. Feel free to use and modify it for your needs.
