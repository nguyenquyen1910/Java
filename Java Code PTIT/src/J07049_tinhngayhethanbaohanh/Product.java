package J07049_tinhngayhethanbaohanh;

public class Product {
    private String proId;
    private String proName;
    private long price;
    private int month;

    public Product(String proId, String proName, long price, int month) {
        this.proId = proId;
        this.proName = proName;
        this.price = price;
        this.month = month;
    }

    public String getProId() {
        return proId;
    }

    public int getMonth() {
        return month;
    }

    public long getPrice() {
        return price;
    }
}
