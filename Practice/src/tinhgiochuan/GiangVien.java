package tinhgiochuan;

public class GiangVien {
    private String maGV, tenGV;
    private double tongGio;

    public GiangVien(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void addTime(double time){
        this.tongGio += time;
    }

    @Override
    public String toString() {
        return tenGV+" "+String.format("%.2f", tongGio);
    }
}
