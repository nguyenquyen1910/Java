package J05006_danhsachdoituongnhanvien;

public class NhanVien {
    private String ma,ten,gt,ns,dc,mst,ngay;

    public NhanVien(int i, String ten, String gt, String ns, String dc, String mst, String ngay) {
        this.ma = String.format("%05d",i+1);
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.ngay = ngay;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+gt+" "+ns+" "+dc+" "+mst+" "+ngay;
    }
}
