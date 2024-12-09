package hoadon2;

public class HoaDon {
    private String ma, maKH, maMH;
    private int soLuong;
    private KhachHang khachHang;
    private MatHang matHang;
    private long thanhTien;

    public HoaDon(int i, String maKH, String maMH, int soLuong) {
        this.ma = "HD"+String.format("%03d", i+1);
        this.maKH = maKH;
        this.maMH = maMH;
        this.soLuong = soLuong;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
        this.thanhTien = matHang.getGiaBan() * soLuong;
    }

    @Override
    public String toString() {
        return ma+" "+khachHang.getTen()+" "+khachHang.getDiaChi()+" "+matHang.getTen()+" "+matHang.getDonViTinh()+" "
                +matHang.getGiaMua()+" "+matHang.getGiaBan()+" "+soLuong+" "+thanhTien;
    }
}
