package collections.list;

public class Order {
    private int orderId;
    private String produkt;
    private double price;
    private OrderStatus status;

    public Order(int orderId, String produkt, double price, OrderStatus status) {
        this.orderId = orderId;
        this.produkt = produkt;
        this.price = price;
        this.status = status;
    }

    public String toString() {
        return "{ORDER " + orderId + ", Produkt: " + produkt + ", price: " + price + ". Order Status: " + status + "}";
    }

    public int getOrderId() {
        return orderId;
    }
    public String getProdukt() {
        return produkt;
    }
    public double getPrice() {
        return price;
    }
    public OrderStatus getOrderStatus() {
        return status;
    }
}
