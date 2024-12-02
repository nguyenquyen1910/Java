package J05073_tinhtoangiaban;

public class Order {
    private String id;
    private long price;
    private long quantity;
    private double fee;
    private double shippingFee;
    private double totalAmount;

    public Order(String id, long price, long quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.shippingFee = solveShippingFee();
        this.fee = id.endsWith("C") ? solveFee()*0.95 : solveFee();
        this.totalAmount = (price*quantity+this.shippingFee+this.fee)*1.2/quantity;
    }

    private double solveShippingFee() {
        if(id.startsWith("T")){
            return (price*quantity*0.04);
        }
        if(id.startsWith("C")){
            return (price*quantity*0.03);
        }
        if(id.startsWith("D")){
            return (price*quantity*0.025);
        }
        return (price*quantity*0.005);
    }

    private double solveFee() {
        if(id.startsWith("T")){
            return (price*quantity*0.29);
        }
        if(id.startsWith("C")){
            return (price*quantity*0.1);
        }
        if(id.startsWith("D")){
            return (price*quantity*0.08);
        }
        return (price*quantity*0.02);
    }

    @Override
    public String toString() {
        return id+" "+String.format("%.2f",totalAmount);
    }
}
