package muahang;

public class Product {
    private String prodId;
    private String prodName;
    private long prodPrice;
    private int prodWantity;

    public Product(String prodId, String prodName, long prodPrice, int prodWantity) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodWantity = prodWantity;
    }

    public String getProdId() {
        return prodId;
    }

    public long getProdPrice() {
        return prodPrice;
    }

    public int getProdWantity() {
        return prodWantity;
    }
}
