package J06005_quanlibanhang;

public class Invoice implements Comparable<Invoice> {
    private String invoId,info,cusId,proId;
    private int quantity,profit,total;
    private Customer customer;
    private Product product;
    public Invoice(int i,String info){
        this.info=info;
        this.invoId="HD"+String.format("%03d",i+1);
        this.cusId=info.substring(0,5);
        this.proId=info.substring(6,11);
        this.quantity=Integer.parseInt(info.substring(12));
    }
    public void setCustomer(Customer c){
        this.customer=c;
    }
    public void setProduct(Product p){
        this.product=p;
        this.profit=solveProfit();
        this.total=solveTotal();
    }
    public int solveProfit(){
        return product.getProSell()*quantity;
    }
    public int solveTotal(){
        return quantity*(product.getProSell()-product.getProBuy());
    }

    public String getCusId() {
        return cusId;
    }

    public String getProId() {
        return proId;
    }

    @Override
    public String toString() {
        return invoId+" "+customer.getCusName()+" "+customer.getCusAddress()+" "+product.getProName()+" "
                +quantity+" "+profit+" "+total;
    }

    @Override
    public int compareTo(Invoice o) {
        return Integer.compare(o.quantity,this.quantity);
    }
}
