import java.util.List;

public class OrderFulfillmentProxy implements IOrder {
    private List<Warehouse> warehouses;

    public OrderFulfillmentProxy(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public void fulfillOrder(Order order) {
        for (Item item : order.itemList) {
            for (Warehouse warehouse : warehouses) {
                if (warehouse.currentInventory(item) > 0) {
                    warehouse.fulfillOrder(order);
                    return;
                }
            }
        }
        System.out.println("No warehouse can fulfill the order.");
    }
}
