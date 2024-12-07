package quanlybaitapnhom2;

public class SinhVien implements Comparable<SinhVien> {
    private String maSV, tenSV, sdt;
    private int maBT;
    private BaiTap baiTap;

    public SinhVien(String maSV, String tenSV, String sdt, int maBT) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.sdt = sdt;
        this.maBT = maBT;
    }

    public int getMaBT() {
        return maBT;
    }

    public void setBaiTap(BaiTap baiTap) {
        this.baiTap = baiTap;
    }

    @Override
    public String toString() {
        return maSV+" "+tenSV+" "+sdt+" "+maBT+" "+baiTap.getTenBT();
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSV.compareTo(o.maSV);
    }
}
