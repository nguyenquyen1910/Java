package J07020_hoadon2;

public class Invoice {
    private String invoiceId;
    private String cusId;
    private String proId;
    private int quantity;
    private Customer customer;
    private Product product;
    private long totalAmount;

    public Invoice(int i, String cusId, String proId, int quantity) {
        this.invoiceId = "HD"+String.format("%03d", i+1);
        this.cusId = cusId;
        this.proId = proId;
        this.quantity = quantity;
    }

    public String getProId() {
        return proId;
    }

    public String getCusId() {
        return cusId;
    }

    public void setProduct(Product product) {
        this.product = product;
        this.totalAmount = product.getSellPrice() * quantity;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return invoiceId+" "+customer.getCusName()+" "+customer.getAddress()+" "+product.getProductName()+" "+product.getProductUnit()+" "+
                product.getBuyPrice()+" "+product.getSellPrice()+" "+quantity+" "+totalAmount;
    }
}
