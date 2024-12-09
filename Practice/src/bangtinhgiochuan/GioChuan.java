package bangtinhgiochuan;

public class GioChuan {
    private String idMH, idGV;
    private double time;
    private GiangVien giangVien;

    public GioChuan(String idGV, String idMH, double time) {
        this.idGV = idGV;
        this.idMH = idMH;
        this.time = time;
    }

    public String getIdGV() {
        return idGV;
    }

    public void setGiangVien(GiangVien giangVien) {
        this.giangVien = giangVien;
    }

    public double getTime() {
        return time;
    }
}
