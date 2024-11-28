package baocaosanpham;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Customer implements Comparable<Customer> {
    private String id;
    private String name;
    private String address;
    private String productId;
    private int quantity;
    private Date dateBuy;
    private Product product;
    private int totalPrice;
    private Date dateWarranty;

    public Customer(int i, String name, String address, String productId, int quantity, Date dateBuy) {
        this.id = "KH" + String.format("%02d",i+1);
        this.name = name;
        this.address = address;
        this.productId = productId;
        this.quantity = quantity;
        this.dateBuy = dateBuy;
        this.totalPrice = 0;
        this.dateWarranty = null;
    }

    public void setProduct(Product product) {
        this.product = product;
        if (product != null) {
            this.totalPrice = quantity * product.getSellPrice();
            this.dateWarranty = solveDateWarranty();
        }
    }

    public String getProductId() {
        return productId;
    }

    public Date solveDateWarranty() {
        LocalDate dayStart = dateBuy.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dayEnd = dayStart.plusMonths(product.getWarranty());
        return Date.from(dayEnd.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return id+" "+name+" "+address+" "+productId+" "+totalPrice+" "+sdf.format(dateWarranty);
    }

    @Override
    public int compareTo(Customer o) {
        int dateComparison = this.dateWarranty.compareTo(o.dateWarranty);
        if (dateComparison != 0) {
            return dateComparison;
        }
        return this.id.compareTo(o.id);
    }
}
