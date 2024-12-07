package quanlykhachsan;

public class Phong {
    private String ma, ten;
    private long giaNgay;
    private double phiPhucVu;

    public Phong(String ma, String ten, long giaNgay, double phiPhucVu) {
        this.ma = ma;
        this.ten = ten;
        this.giaNgay = giaNgay;
        this.phiPhucVu = phiPhucVu;
    }

    public String getMa() {
        return ma;
    }

    public long getGiaNgay() {
        return giaNgay;
    }

    public double getPhiPhucVu() {
        return phiPhucVu;
    }
}
