package J07037_danhsachdoanhnghiep;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String maDN,tenDN;
    private int soSV;

    public DoanhNghiep(String maDN, String tenDN, int soSV) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soSV = soSV;
    }

    public String getMaDN() {
        return maDN;
    }

    @Override
    public String toString() {
        return maDN+" "+tenDN+" "+soSV;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        return this.maDN.compareTo(o.maDN);
    }
}
