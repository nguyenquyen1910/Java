package quanlybaitapnhom2;

public class BaiTap {
    private int maBT;
    private String tenBT;

    public BaiTap(int i, String tenBT) {
        this.maBT = i+1;
        this.tenBT = tenBT;
    }

    public int getMaBT() {
        return maBT;
    }

    public String getTenBT() {
        return tenBT;
    }
}
