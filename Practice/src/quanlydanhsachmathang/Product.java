package quanlydanhsachmathang;

public class Product implements Comparable<Product> {
    private String id, name, unit;
    private long buyPrice, sellPrice;
    private long profit;

    public Product(int i, String name, String unit, long buyPrice, long sellPrice) {
        this.id = "MH"+String.format("%03d", i+1);
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.profit = sellPrice - buyPrice;
    }


    @Override
    public int compareTo(Product o) {
        if(this.profit != o.profit){
            return Long.compare(o.profit, this.profit);
        }
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+unit+" "+buyPrice+" "+sellPrice+" "+profit;
    }
}
