package quanlybaitapnhom;

public class BaiTap {
    private String maBT, tenBT;

    public BaiTap(int i, String tenBT) {
        this.maBT = String.valueOf(i+1);
        this.tenBT = tenBT;
    }

    public String getMaBT() {
        return maBT;
    }

    public String getTenBT() {
        return tenBT;
    }
}
