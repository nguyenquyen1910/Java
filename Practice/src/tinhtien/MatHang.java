package tinhtien;

public class MatHang implements Comparable<MatHang> {
    private String ma, ten;
    private int soLuong;
    private long donGia, tienChietKhau, tongTien;

    public MatHang(String ma, String ten, int soLuong, long donGia, long tienChietKhau) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.tienChietKhau = tienChietKhau;
        this.tongTien = donGia*soLuong - tienChietKhau;
    }


    @Override
    public int compareTo(MatHang o) {
        return Long.compare(o.tongTien, this.tongTien);
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+soLuong+" "+donGia+" "+tienChietKhau+" "+tongTien;
    }
}
