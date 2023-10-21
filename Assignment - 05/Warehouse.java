import java.util.Hashtable;

public class Warehouse implements IOrder {
    private Hashtable<String, Integer> stock;
    private String address;

    public Warehouse(String address) {
        this.address = address;
        this.stock = new Hashtable<>();
    }

    public void fulfillOrder(Order order) {
        for (Item item : order.itemList) {
            if (currentInventory(item) > 0) {
                this.stock.replace(item.sku, stock.get(item.sku) - 1);
                System.out.println("Order fulfilled by Warehouse at " + this.address);
                return;
            }
        }
        System.out.println("Order cannot be fulfilled by Warehouse at " + this.address);
    }

    public int currentInventory(Item item) {
        return stock.getOrDefault(item.sku, 0);
    }
    
    public void addToStock(String sku, int quantity) {
        stock.put(sku, quantity);
    }
}
