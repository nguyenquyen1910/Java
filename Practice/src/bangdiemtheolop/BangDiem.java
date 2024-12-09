package bangdiemtheolop;

public class BangDiem implements Comparable<BangDiem> {
    private String maSV, maMH, diem;
    private double diemSapXep;
    private SinhVien sinhVien;
    private MonHoc monHoc;

    public BangDiem(String maSV, String maMH, String diem) {
        this.maSV = maSV;
        this.maMH = maMH;
        this.diem = diem;
        this.diemSapXep = Double.parseDouble(diem);
    }

    public String getMaSV() {
        return maSV;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    @Override
    public String toString() {
        return maSV+" "+sinhVien.getTenSV()+" "+maMH+" "+monHoc.getTenMH()+" "+diem;
    }

    @Override
    public int compareTo(BangDiem o) {
        if(!this.maMH.equals(o.maMH)){
            return this.maMH.compareTo(o.maMH);
        }
        return this.maSV.compareTo(o.maSV);
    }
}
