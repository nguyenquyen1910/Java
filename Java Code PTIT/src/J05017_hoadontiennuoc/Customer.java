package J05017_hoadontiennuoc;

public class Customer implements Comparable<Customer> {
    private String id;
    private String name;
    private Integer oldNumber;
    private Integer newNumber;
    private Long price;
    private Long fee;
    private Long totalAmount;

    public Customer(int i, String name, Integer oldNumber, Integer newNumber) {
        this.id = "KH" + String.format("%02d", i+1);
        this.name = name;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.price = Math.min(50, (this.newNumber-this.oldNumber)) * 100L;
        this.fee = Math.round(price * 0.02);
        if(this.newNumber - this.oldNumber > 50){
            this.price += Math.min(50, this.newNumber - this.oldNumber - 50) * 150L;
            this.fee = Math.round(price * 0.03);
        }
        if(this.newNumber - this.oldNumber > 100){
            this.price += (this.newNumber - this.oldNumber - 100) * 200L;
            this.fee = Math.round(price * 0.05);
        }
        this.totalAmount = this.price + this.fee;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+totalAmount;
    }

    @Override
    public int compareTo(Customer o) {
        return o.totalAmount.compareTo(this.totalAmount);
    }
}
