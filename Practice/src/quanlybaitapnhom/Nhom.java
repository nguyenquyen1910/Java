package quanlybaitapnhom;

public class Nhom implements Comparable<Nhom> {
    private String maSV, maBT;
    private SinhVien sinhVien;
    private BaiTap baiTap;

    public Nhom(String maSV, String maBT) {
        this.maSV = maSV;
        this.maBT = maBT;
    }

    public String getMaBT() {
        return maBT;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public void setBaiTap(BaiTap baiTap) {
        this.baiTap = baiTap;
    }

    @Override
    public String toString() {
        return maSV+" "+sinhVien.getTenSV()+" "+sinhVien.getDienThoai()+" "+maBT+" "+baiTap.getTenBT();
    }

    @Override
    public int compareTo(Nhom o) {
        return this.maSV.compareTo(o.maSV);
    }
}
