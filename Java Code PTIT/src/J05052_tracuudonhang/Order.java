package J05052_tracuudonhang;

public class Order implements Comparable<Order> {
    private String orderName;
    private String orderId;
    private Integer orderPrice;
    private Integer quantity;
    private Long discount;
    private String orderNumber;
    private Long totalAmount;

    public Order(String orderName, String orderId, Integer orderPrice, Integer quantity) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderPrice = orderPrice;
        this.quantity = quantity;
        this.discount = solveDiscount();
        this.orderNumber = this.orderId.substring(1,4);
        this.totalAmount = this.orderPrice * this.quantity - this.discount;
    }

    private Long solveDiscount() {
        if(orderId.substring(orderId.length()-1, orderId.length()).equals("1")) {
            return (long) Math.ceil(orderPrice * quantity * 0.5);
        }
        return (long) Math.ceil(orderPrice * quantity * 0.3);
    }

    @Override
    public String toString() {
        return orderName+" "+orderId+" "+orderNumber+" "+discount+" "+totalAmount;
    }

    @Override
    public int compareTo(Order o) {
        return this.orderNumber.compareTo(o.orderNumber);
    }
}
