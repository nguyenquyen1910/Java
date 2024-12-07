package tinhgiochuan;

public class GioChuan {
    private String maGV, maMH;
    private double time;

    public GioChuan(String maGV, String maMH, double time) {
        this.maGV = maGV;
        this.maMH = maMH;
        this.time = time;
    }

    public String getMaGV() {
        return maGV;
    }

    public double getTime() {
        return time;
    }
}
