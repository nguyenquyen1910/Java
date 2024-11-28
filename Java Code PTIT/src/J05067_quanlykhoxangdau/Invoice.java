package J05067_quanlykhoxangdau;

public class Invoice implements Comparable<Invoice> {
    private String id;
    private int quantity;
    private String typeName;
    private long price;
    private long fee;
    private long totalPrice;
    private long totalAmount;

    public Invoice(String id, int quantity) {
        this.id = id;
        this.quantity = quantity;
        this.typeName = solveTypeName();
        this.price = solvePrice();
        this.totalPrice = this.price * this.quantity;
        this.fee = solveFee();
        this.totalAmount = this.totalPrice + this.fee;
    }

    private String solveTypeName() {
        if(id.endsWith("BP")) return "British Petro";
        if(id.endsWith("ES")) return "Esso";
        if(id.endsWith("SH")) return "Shell";
        if(id.endsWith("CA")) return "Castrol";
        if(id.endsWith("MO")) return "Mobil";
        return "Trong Nuoc";
    }

    private long solvePrice() {
        if(id.startsWith("X")){
            return 128000L;
        }
        if(id.startsWith("D")){
            return 11200L;
        }
        return 9700L;
    }

    private long solveFee() {
        if(id.endsWith("TN")){
            return 0;
        }
        if(id.startsWith("X")){
            return Math.round(totalPrice * 0.03);
        }
        if(id.startsWith("D")){
            return Math.round(totalPrice * 0.035);
        }
        return Math.round(totalPrice * 0.02);
    }

    @Override
    public String toString() {
        return id + " " + typeName + " " + price + " " + fee + " " + totalAmount;
    }

    @Override
    public int compareTo(Invoice o) {
        return Long.compare(o.totalAmount, this.totalAmount);
    }
}
