package danhsachsanpham;

public class SanPham implements Comparable<SanPham> {
    private String ma, ten;
    private long gia, baoHanh;

    public SanPham(String ma, String ten, long gia, long baoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.baoHanh = baoHanh;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+gia+" "+baoHanh;
    }

    @Override
    public int compareTo(SanPham o) {
        if(this.gia != o.gia){
            return Long.compare(o.gia, this.gia);
        }
        return this.ma.compareTo(o.ma);
    }
}
