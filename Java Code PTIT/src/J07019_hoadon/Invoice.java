package J07019_hoadon;

public class Invoice {
    private String invoiceId;
    private String productId;
    private int quantity;
    private long discount;
    private long price;
    private Product product;
    private long totalAmount;

    public Invoice(int i, String productId, int quantity) {
        this.productId = productId;
        this.invoiceId = productId + "-" + String.format("%03d", i+1);
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProduct(Product product) {
        this.product = product;
        this.price = productId.endsWith("1") ? product.getPrice1() : product.getPrice2();
        this.discount = solveDiscount();
        this.totalAmount = this.price * this.quantity - this.discount;
    }

    private long solveDiscount() {
        if(quantity>=150){
            return (long) (price*quantity*0.5);
        }
        if(quantity>=100){
            return (long) (price*quantity*0.3);
        }
        if(quantity>=50){
            return (long) (price*quantity*0.15);
        }
        return 0;
    }

    @Override
    public String toString() {
        return invoiceId+" "+product.getName()+" "+discount+" "+totalAmount;
    }
}
