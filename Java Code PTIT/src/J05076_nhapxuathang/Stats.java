package J05076_nhapxuathang;

public class Stats {
    private String productId;
    private int quantity;
    private long price;
    private int quantityOut;
    private Product product;
    private long totalIn;
    private long totalOut;

    public Stats(String productId, int quantity, long price, int quantityOut) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.quantityOut = quantityOut;
        this.totalIn = price * quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProduct(Product product) {
        this.product = product;
        this.totalOut = price * quantityOut + Math.round((price * quantityOut) * product.getProfitRate());
    }

    @Override
    public String toString() {
        return productId+" "+product.getName()+" "+totalIn+" "+totalOut;
    }
}
