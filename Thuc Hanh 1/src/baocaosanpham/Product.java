package baocaosanpham;

public class Product {
    private String id;
    private String name;
    private int sellPrice;
    private int warranty;

    public Product(String id, String name, int sellPrice, int warranty) {
        this.id = id;
        this.name = name;
        this.sellPrice = sellPrice;
        this.warranty = warranty;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getWarranty() {
        return warranty;
    }
}
