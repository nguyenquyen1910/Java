package hoadon2;

public class MatHang {
    private String ma, ten, donViTinh;
    private long giaBan, giaMua;

    public MatHang(int i, String ten, String donViTinh, long giaMua, long giaBan) {
        this.ma = "MH"+String.format("%03d", i+1);
        this.ten = ten;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public long getGiaMua() {
        return giaMua;
    }
}
