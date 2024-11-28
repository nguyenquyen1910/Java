package J05036_tinhgiaban;

public class Product implements Comparable<Product>{
    private String id;
    private String name;
    private String unit;
    private Long buyPrice;
    private Integer quantity;
    private Long deliveryPrice;
    private Long totalPrice;
    private Long sellPrice;

    public Product(int i, String name, String unit, Long buyPrice, Integer quantity) {
        this.id = "MH"+String.format("%02d",i+1);
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.quantity = quantity;
        this.deliveryPrice = solveDeliveryPrice();
        this.totalPrice = solveTotalPrice();
        this.sellPrice = solveSellPrice();
    }

    private Long solveDeliveryPrice(){
        return Math.round((buyPrice * quantity) * 0.05);
    }

    private Long solveTotalPrice(){
        return buyPrice * quantity + deliveryPrice;
    }

    private Long solveSellPrice(){
        return (long) (Math.ceil((totalPrice * 1.02) / quantity / 100) * 100);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+unit+" "+deliveryPrice+" "+totalPrice+" "+sellPrice;
    }

    @Override
    public int compareTo(Product o) {
        return Long.compare(o.sellPrice, this.sellPrice);
    }
}
