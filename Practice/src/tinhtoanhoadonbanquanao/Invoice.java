package tinhtoanhoadonbanquanao;

public class Invoice {
    private String id;
    private String proId;
    private int quantity;
    private long price;
    private long discount;
    private long totalAmount;
    private Product product;
    public Invoice(int i, String proId, int quantity) {
        this.proId = proId;
        this.id = this.proId+ "-" + String.format("%03d", i+1);
        this.quantity = quantity;
    }

    public String getProId() {
        return proId;
    }

    private long solveDiscount() {
        if(quantity >= 150){
            return Math.round(price * quantity * 0.5);
        }
        if(quantity >= 100){
            return Math.round(price * quantity * 0.3);
        }
        return Math.round(price * quantity * 0.15);
    }

    public void setProduct(Product product) {
        this.product = product;
        this.price = solvePrice();
        this.discount = solveDiscount();
        this.totalAmount = solveTotalAmount();
    }

    private long solveTotalAmount() {
        return price * quantity - discount;
    }

    private long solvePrice(){
        if((proId.charAt(2)-'0') == 1){
            return product.getProPrice1();
        }
        return product.getProPrice2();
    }


    @Override
    public String toString() {
        return id+" "+product.getProName()+" "+discount+" "+totalAmount;
    }
}
