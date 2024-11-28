package J07033_danhsachsinhvientrongfile1;

public class SinhVien implements Comparable<SinhVien> {
    private String maSV,tenSV,lop,email;

    public SinhVien(String maSV, String tenSV, String lop, String email) {
        this.email = email;
        this.lop = lop;
        this.maSV = maSV;
        this.tenSV = tenSV;
    }

    public String getMaSV(){
        return maSV;
    }

    @Override
    public String toString() {
        return maSV+" "+tenSV+" "+lop+" "+email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.getMaSV().compareTo(o.maSV);
    }
}
