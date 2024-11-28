package J07050_sapxepmathang;

public class MatHang implements Comparable<MatHang> {
    private String id;
    private String name;
    private String type;
    private double buyPrice;
    private double sellPrice;
    private double profit;

    public MatHang(int i, String name, String type, double buyPrice, double sellPrice) {
        this.id = "MH"+String.format("%02d", i+1);
        this.name = name;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.profit = this.sellPrice-this.buyPrice;
    }

    @Override
    public int compareTo(MatHang o) {
        return Double.compare(o.buyPrice, this.buyPrice);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+type+" "+String.format("%.2f",profit);
    }
}
