package bangtinhgiochuan;

public class GiangVien {
    private String ma, ten;
    private double gioChuan;

    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        this.gioChuan = 0;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public void addTime(double time){
        this.gioChuan += time;
    }

    @Override
    public String toString() {
        return ten+" "+String.format("%.2f", gioChuan);
    }
}
