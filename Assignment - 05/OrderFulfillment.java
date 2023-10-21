import java.util.List;

public class OrderFulfillment implements IOrder {
    private List<Warehouse> warehouses;

    public OrderFulfillment(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public void fulfillOrder(Order order) {
        for (Item item : order.itemList) {
            for (Warehouse warehouse : warehouses) {
                warehouse.fulfillOrder(order);
            }
        }
    }
}
