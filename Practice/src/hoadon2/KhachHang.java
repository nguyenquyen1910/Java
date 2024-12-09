package hoadon2;

public class KhachHang {
    private String ma, ten, gioiTinh, ngaySinh, diaChi;

    public KhachHang(int i, String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ma = "KH"+String.format("%03d", i+1);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }
}
