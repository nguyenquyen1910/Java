package tinhngayhethanbaohanh;

public class SanPham {
    private String maSP, tenSP;
    private long giaBan, thoiGian;

    public SanPham(String maSP, String tenSP, long giaBan, long thoiGian) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.thoiGian = thoiGian;
    }

    public String getMaSP() {
        return maSP;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public long getThoiGian() {
        return thoiGian;
    }
}
