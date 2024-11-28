package J05012_tinhtien;

public class Product implements Comparable<Product> {
    private String id;
    private String name;
    private int quantity;
    private Long price;
    private Long fee;
    private Long profit;

    public Product(String id, String name, int quantity, Long price, Long fee) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.fee = fee;
        this.profit = price * quantity - fee;
    }


    @Override
    public int compareTo(Product o) {
        return Long.compare(o.profit,this.profit);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+quantity+" "+price+" "+fee+" "+profit;
    }
}
