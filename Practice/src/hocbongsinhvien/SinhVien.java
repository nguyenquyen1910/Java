package hocbongsinhvien;

public class SinhVien implements Comparable<SinhVien> {
    private String ten;
    private double gpa;
    private int diemRenLuyen;
    private String trangThai;
    private int index;

    public SinhVien(String ten, double gpa, int diemRenLuyen, int index) {
        this.ten = ten;
        this.gpa = gpa;
        this.diemRenLuyen = diemRenLuyen;
        this.trangThai = xuLyHocBong();
        this.index = index;
    }

    private String xuLyHocBong() {
        if(gpa >= 3.6 && diemRenLuyen >= 90){
            return "XUATSAC";
        }
        if(gpa > 3.2 && diemRenLuyen >= 80){
            return "GIOI";
        }
        if(gpa > 2.5 && diemRenLuyen >= 70){
            return "KHA";
        }
        return "KHONG";
    }

    public double getGpa() {
        return gpa;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return ten+": "+trangThai;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.gpa != o.gpa){
            return Double.compare(o.gpa, this.gpa);
        }
        return o.diemRenLuyen - this.diemRenLuyen;
    }
}
