package bangdiemtheolop;

public class MonHoc {
    private String maMH, tenMH;
    private int credit;

    public MonHoc(String maMH, String tenMH, int credit) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.credit = credit;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getCredit() {
        return credit;
    }
}
