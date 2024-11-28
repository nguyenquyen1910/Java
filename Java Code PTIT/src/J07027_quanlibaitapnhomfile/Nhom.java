package J07027_quanlibaitapnhomfile;

public class Nhom implements Comparable<Nhom> {
    private String info;
    private String idSV;
    private int idEx;
    private SinhVien sinhVien;
    private BaiTap baiTap;

    public Nhom(String info) {
        String[] tmp=info.split("\\s+");
        this.idSV = tmp[0];
        this.idEx = Integer.parseInt(tmp[1]);
    }

    public String getIdSV() {
        return idSV;
    }

    public int getIdEx() {
        return idEx;
    }


    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }


    public void setBaiTap(BaiTap baiTap) {
        this.baiTap = baiTap;
    }

    @Override
    public String toString() {
        return idSV+" "+sinhVien.getName()+" "+sinhVien.getPhone()+" "+idEx+" "+baiTap.getName();
    }

    @Override
    public int compareTo(Nhom o) {
        return this.idSV.compareTo(o.idSV);
    }
}
