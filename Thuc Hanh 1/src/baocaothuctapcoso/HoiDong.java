package baocaothuctapcoso;

public class HoiDong {
    private String idSV;
    private String idDT;
    private String idHD;
    private SinhVien sinhVien;
    private DeTai deTai;

    public HoiDong(String idSV, String idDT, String idHD) {
        this.idSV = idSV;
        this.idDT = idDT;
        this.idHD = idHD;
    }

    public String getIdSV() {
        return idSV;
    }

    public String getIdDT() {
        return idDT;
    }

    public String getIdHD() {
        return idHD;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public void setDeTai(DeTai deTai) {
        this.deTai = deTai;
    }

    @Override
    public String toString() {
        return idSV+" "+sinhVien.getName()+" "+deTai.getNameTopic()+" "+deTai.getNameLecturer();
    }
}
