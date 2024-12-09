package lietkenhapxuathangtheonhom;

public class DonHang implements Comparable<DonHang> {
    private String maHang;
    private long soLuongNhap;
    private long soLuongXuat, gia, thue, tongTien;

    public DonHang(String maHang, int soLuongNhap) {
        this.maHang = maHang;
        this.soLuongNhap = soLuongNhap;
        this.soLuongXuat = maHang.startsWith("A") ? Math.round(soLuongNhap*0.6) : Math.round(soLuongNhap*0.7);
        this.gia = maHang.endsWith("Y") ? 110000 : 135000;
        this.tongTien = this.gia * soLuongXuat;
        this.thue = xuLyThue();
    }

    private long xuLyThue() {
        if(maHang.startsWith("A")){
            return maHang.endsWith("Y") ? (long) (this.tongTien*0.08) : (long) (this.tongTien*0.11);
        }
        return maHang.endsWith("Y") ? (long) (this.tongTien*0.17) : (long) (this.tongTien*0.22);
    }

    public String getMaHang() {
        return maHang;
    }

    @Override
    public String toString() {
        return maHang+" "+soLuongNhap+" "+soLuongXuat+" "+gia+" "+tongTien+" "+thue;
    }

    @Override
    public int compareTo(DonHang o) {
        return Long.compare(o.thue, this.thue);
    }
}
