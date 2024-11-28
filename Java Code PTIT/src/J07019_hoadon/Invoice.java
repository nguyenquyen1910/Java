package J07019_hoadon;

public class Invoice {
    private String id;
    private String invoiceId;
    private int quantity;
    private Product product;
    private long discount;
    private long totalPrice;

    public Invoice(int i, String invoiceId, int quantity) {
        this.invoiceId = invoiceId;
        this.id = invoiceId + "-" + String.format("%03d", i + 1);
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
        this.totalPrice = solveTotalPrice();
        this.discount = solveDiscount();
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public long solveTotalPrice() {
        long res=0;
        if(Integer.parseInt(invoiceId.substring(2))==1){
            res = product.getPrice1() * quantity;
        }
        else{
            res = product.getPrice2() * quantity;
        }
        return res;
    }

    public long solveDiscount(){
        if(quantity>=150){
            return (long) (totalPrice * 0.5);
        }
        if(quantity>=100){
            return (long) (totalPrice * 0.3);
        }
        return (long) (totalPrice * 0.15);
    }

    @Override
    public String toString() {
        return id+" "+product.getName()+" "+discount+" "+(totalPrice-discount);
    }
}
