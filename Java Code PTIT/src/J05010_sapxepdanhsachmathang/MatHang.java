package J05010_sapxepdanhsachmathang;

public class MatHang implements Comparable<MatHang> {
    private int id;
    private String name,group;
    private Float buy,sell,profit;

    public MatHang(int i,String name,String group,Float buy,Float sell) {
        this.id = i+1;
        this.buy = buy;
        this.group = group;
        this.name = name;
        this.sell = sell;
        this.profit=sell-buy;
    }

    @Override
    public int compareTo(MatHang o) {
        return o.profit.compareTo(this.profit);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+group+" "+String.format("%.2f",profit);
    }
}
