package muahang;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Customer implements Comparable<Customer> {
    private String cusId;
    private String cusName;
    private String cusAddress;
    private String prodId;
    private long quatity;
    private String dateOfWan;
    private long totalPrice;
    private Product product;
    private String dayWan;

    public Customer(int i, String cusName, String cusAddress, String prodId, long quatity, String dateOfWan) {
        this.cusId = "KH" + String.format("%02d", i+1);
        this.cusName = cusName;
        this.cusAddress = cusAddress;
        this.prodId = prodId;
        this.quatity = quatity;
        this.dateOfWan = dateOfWan;
    }

    public void setProduct(Product product) {
        this.product = product;
        this.totalPrice = solvePrice();
        this.dayWan = solveDayWan();
    }

    private long solvePrice() {
        return quatity * product.getProdPrice();
    }

    private String solveDayWan() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate sx = LocalDate.parse(dateOfWan, dtf);
        return sx.plusMonths(product.getProdWantity()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getProdId() {
        return prodId;
    }

    @Override
    public String toString() {
        return cusId+" "+cusName+" "+cusAddress+" "+prodId+" "+totalPrice+" "+dayWan;
    }

    @Override
    public int compareTo(Customer o) {
        if(!this.dayWan.equals(o.dayWan)) {
            LocalDate dayS = LocalDate.parse(this.dayWan, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate dayH = LocalDate.parse(o.dayWan, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return dayS.compareTo(dayH);
        }
        return this.cusId.compareTo(o.cusId);
    }
}
