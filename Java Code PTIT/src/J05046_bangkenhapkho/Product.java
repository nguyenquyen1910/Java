package J05046_bangkenhapkho;

import java.util.HashMap;

public class Product implements Comparable<Product> {
    private String id;
    private String productName;
    private Integer quantity;
    private Integer price;
    private Integer discount;
    private Integer totalPrice;
    private static HashMap<String, Integer> map = new HashMap<>();

    public Product(String productName, Integer quantity, Integer price) {
        this.productName = productName;
        this.id = solveId();
        this.quantity = quantity;
        this.price = price;
        this.discount = solveDiscount();
        this.totalPrice = this.price * this.quantity - this.discount;
    }

    private String solveId() {
        String res="";
        String[] tmp = productName.toUpperCase().split("\\s+");
        for(int i=0;i<2;i++){
            res+=tmp[i].charAt(0);
        }
        map.put(res,map.getOrDefault(res,0)+1);
        if(map.containsKey(res)){
            res += String.format("%02d",map.get(res));
        }
        else{
            res += String.format("%02d",1);
        }
        return res;
    }

    private Integer solveDiscount() {
        double discount=0.0;
        if (quantity > 10) {
            discount = price * quantity * 0.05;
        } else if (quantity >= 8 && quantity <= 10) {
            discount = price * quantity * 0.02;
        } else if (quantity >= 5 && quantity < 8) {
            discount = price * quantity * 0.01;
        }
        return (int)Math.round(discount);
    }

    @Override
    public String toString() {
        return id+" "+productName+" "+discount+" "+totalPrice;
    }

    @Override
    public int compareTo(Product o) {
        return o.discount - this.discount;
    }
}
