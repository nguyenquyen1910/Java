package J07019_hoadon;

public class Product {
    private String productId;
    private String name;
    private long price1;
    private long price2;

    public Product(String productId, String name, long price1, long price2) {
        this.productId = productId;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public long getPrice1() {
        return price1;
    }

    public long getPrice2() {
        return price2;
    }
}
