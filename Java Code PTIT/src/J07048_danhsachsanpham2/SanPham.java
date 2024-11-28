package J07048_danhsachsanpham2;

public class SanPham implements Comparable<SanPham> {
    private String id;
    private String name;
    private int price;
    private int warranty;

    public SanPham(String id, String name, int price, int warranty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }

    @Override
    public int compareTo(SanPham o) {
        if(this.price!=o.price){
            return o.price-this.price;
        }
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+price+" "+warranty;
    }
}
