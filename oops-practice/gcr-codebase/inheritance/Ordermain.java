class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void displayInfo() {
        System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate);
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Tracking Number: " + trackingNumber);
    }

    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Delivery Date: " + deliveryDate);
    }

    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class Main {

    public static void main(String[] args) {

        Order order = new Order(101, "28-06-2026");

        ShippedOrder shipped =
                  new ShippedOrder(
                        102,
                        "27-06-2026",
                        "TRK12345");

        DeliveredOrder delivered =
                new DeliveredOrder(
                        103,
                        "25-06-2026",
                        "TRK67890",
                        "29-06-2026");

        System.out.println("----- Order -----");
        order.displayInfo();
        System.out.println("Status : " + order.getOrderStatus());

        System.out.println();

        System.out.println("----- Shipped Order -----");
        shipped.displayInfo();
        System.out.println("Status : " + shipped.getOrderStatus());

        System.out.println();

        System.out.println("----- Delivered Order -----");
        delivered.displayInfo();
        System.out.println("Status : " + delivered.getOrderStatus());
    }
}