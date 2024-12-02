package J07020_hoadon2;

public class Product {
    private String productId;
    private String productName;
    private String productUnit;
    private long buyPrice;
    private long sellPrice;

    public Product(int i, String productName, String productUnit, long buyPrice, long sellPrice) {
        this.productId = "MH"+String.format("%03d", i+1);
        this.productName = productName;
        this.productUnit = productUnit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public long getBuyPrice() {
        return buyPrice;
    }

    public long getSellPrice() {
        return sellPrice;
    }
}
