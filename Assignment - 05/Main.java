import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Warehouse> warehouses = new ArrayList<>();
        Warehouse warehouse1 = new Warehouse("Warehouse 1");
        Warehouse warehouse2 = new Warehouse("Warehouse 2");

        // Initialize the stock levels for the warehouses
        warehouse1.addToStock("SKU123", 10);
        warehouse2.addToStock("SKU123", 5);

        warehouses.add(warehouse1);
        warehouses.add(warehouse2);

        OrderFulfillmentProxy orderFulfillmentProxy = new OrderFulfillmentProxy(warehouses);

        List<Item> items = new ArrayList<>();
        Item item = new Item("SKU123");
        items.add(item);

        Order order = new Order(items);

        orderFulfillmentProxy.fulfillOrder(order);
    }
}
