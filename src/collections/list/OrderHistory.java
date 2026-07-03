package collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static collections.list.OrderStatus.*;

public class OrderHistory {

    List<Order> orders = new ArrayList<>();

    public void addToList(Order order) {
        orders.add(order);
    }

    public void printAllOrders() {
        for(Order o : orders) {
            System.out.println(o);
        }
    }

    public void sortByPrice() {
       orders.sort(Comparator.comparing(order -> order.getPrice()));
    }

    public void sortByOrderId() {
        orders.sort(Comparator.comparing(order -> order.getOrderId()));
    }

    public void sortByOrderIdDesc() {
        orders.sort(Comparator.comparing((Order order) -> order.getOrderId()).reversed());
    }

    public void removeCancelledOrders() {
        orders.removeIf(o -> {
            boolean isCancelled = o.getOrderStatus().equals(CANCELLED);
            if(isCancelled) {
                System.out.println("Cancelled order with ID " + o.getOrderId() + " was removed from the list");
            }
            return isCancelled;
        });
    }

    public double calculateTotalPrice(){
     double totalprice = 0;

     for(Order o : orders) {
         totalprice = totalprice + o.getPrice();
     }
        System.out.println("Total price: " + totalprice);
     return totalprice;
    }





    public static void main(String[] args) {

        Order order1 = new Order(0001, "Iphone 17", 1000.00, SHIPPED);
        Order order2 = new Order(0002, "Ipad", 1500.00, PENDING);
        Order order3 = new Order(0003, "IMac", 2500.00, SHIPPED);
        Order order4 = new Order(0004, "Iphone 16", 800.00, CANCELLED);

        OrderHistory orderHistory = new OrderHistory();

        orderHistory.addToList(order1);
        orderHistory.addToList(order2);
        orderHistory.addToList(order3);
        orderHistory.addToList(order4);

        orderHistory.printAllOrders();

        System.out.println();
        System.out.println("Orders sorted by price: ");

        orderHistory.sortByPrice();
        orderHistory.printAllOrders();

        System.out.println();
        System.out.println("Orders sorted by Order ID: ");

        orderHistory.sortByOrderId();
        orderHistory.printAllOrders();

        System.out.println();
        System.out.println("Orders sorted by Order ID (desc): ");

        orderHistory.sortByOrderIdDesc();
        orderHistory.printAllOrders();

        System.out.println();
        System.out.println("Remove cancelled orders: ");

        orderHistory.removeCancelledOrders();
        orderHistory.printAllOrders();

        System.out.println();
        orderHistory.calculateTotalPrice();

    }
}
