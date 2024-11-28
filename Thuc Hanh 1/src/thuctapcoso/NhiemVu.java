package thuctapcoso;

public class NhiemVu implements Comparable<NhiemVu> {
    private String idSv;
    private String idTopic;
    private SinhVien sinhVien;
    private DeTai deTai;

    public NhiemVu(String idSv, String idTopic) {
        this.idSv = idSv;
        this.idTopic = idTopic;
    }

    public String getIdSv() {
        return idSv;
    }

    public String getIdTopic() {
        return idTopic;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public void setDeTai(DeTai deTai) {
        this.deTai = deTai;
    }

    @Override
    public String toString() {
        return idSv+" "+sinhVien.getName()+" "+sinhVien.getPhone()+" "+sinhVien.getEmail()+" "+deTai.getNameLecturer()+
                " "+deTai.getNameTopic();
    }

    @Override
    public int compareTo(NhiemVu o) {
        return this.deTai.getNameTopic().compareTo(o.deTai.getNameTopic());
    }

}
