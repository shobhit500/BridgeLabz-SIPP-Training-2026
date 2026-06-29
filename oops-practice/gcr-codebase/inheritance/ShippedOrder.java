class ShippedOrder extends Order {

    private String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {

        super(orderId, orderDate);

        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Tracking Number : " + trackingNumber);
    }
}