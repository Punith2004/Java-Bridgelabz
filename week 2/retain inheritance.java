class Order {
    private String orderId;
    private String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }

    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order("O123", "2025-04-01");
        ShippedOrder shippedOrder = new ShippedOrder("O124", "2025-04-02", "TN56789");
        DeliveredOrder deliveredOrder = new DeliveredOrder("O125", "2025-04-03", "TN67890", "2025-04-05");

        order.displayDetails();
        System.out.println();

        shippedOrder.displayDetails();
        System.out.println();

        deliveredOrder.displayDetails();
    }
}
