package J07049_tinhngayhethanbaohanh;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Customer implements Comparable<Customer> {
    private String cusId;
    private String cusName;
    private String cusAddress;
    private String proId;
    private int quantity;
    private String dateOfPurchase;
    private Product product;
    private long totalAmount;
    private String expiration;

    public Customer(int i, String cusName, String cusAddress, String proId, int quantity, String dateOfPurchase) {
        this.cusId = "KH"+String.format("%02d", i+1);
        this.cusName = cusName;
        this.cusAddress = cusAddress;
        this.proId = proId;
        this.quantity = quantity;
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getProId() {
        return proId;
    }

    public void setProduct(Product product) {
        this.product = product;
        this.totalAmount = this.product.getPrice() * this.quantity;
        this.expiration = handleExpiration();
    }

    private String handleExpiration() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(dateOfPurchase, dtf);
        return localDate.plusMonths(product.getMonth()).format(dtf);
    }

    @Override
    public String toString() {
        return cusId+" "+cusName+" "+cusAddress+" "+proId+" "+totalAmount+" "+expiration;
    }

    @Override
    public int compareTo(Customer o) {
        if(!this.expiration.equals(o.expiration)){
            LocalDate dayS = LocalDate.parse(this.expiration, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate dayH = LocalDate.parse(o.expiration, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return dayS.compareTo(dayH);
        }
        return this.cusId.compareTo(o.cusId);
    }
}
