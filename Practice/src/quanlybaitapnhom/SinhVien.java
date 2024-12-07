package quanlybaitapnhom;

public class SinhVien {
    private String maSV, tenSV, dienThoai;

    public SinhVien(String maSV, String tenSV, String dienThoai) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.dienThoai = dienThoai;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getDienThoai() {
        return dienThoai;
    }
}
