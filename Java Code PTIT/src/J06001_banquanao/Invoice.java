package J06001_banquanao;

public class Invoice {
    private String info;
    private String id,productId;
    private int quantity,promote,total,profit;
    private Product product;

    public Invoice(int i,String info) {
        this.info = info;
        String[] parts = info.split("\\s+");
        this.productId = parts[0];
        this.quantity = Integer.parseInt(parts[1]);
        this.id = this.productId+"-"+String.format("%03d",i+1);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
        this.total=solveTotal();
        this.promote=solvePromote();
        this.profit=total-promote;
    }

    public String getProductId(){
        return productId;
    }

    public int solvePromote() {
        int res=0;
        if(quantity>=150){
            res=(int)(total*0.5);
        }
        else if(quantity>=100 && quantity<150){
            res=(int)(total*0.3);
        }
        else if(quantity>=50 && quantity<100){
            res=(int)(total*0.15);
        }
        else res=0;
        return res;
    }

    public int solveTotal(){
        int typePrice=productId.endsWith("1") ? product.getPrice1() : product.getPrice2();
        return typePrice*quantity;
    }

    @Override
    public String toString() {
        return id+" "+product.getName()+" "+promote+" "+profit;
    }

}
