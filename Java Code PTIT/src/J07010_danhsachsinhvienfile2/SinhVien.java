package J07010_danhsachsinhvienfile2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {
    private String maSV,ten,lop,ns;
    private float gpa;

    public SinhVien(int i, String ten, String lop, String ns, float gpa) throws ParseException {
        this.maSV = "B20DCCN"+String.format("%03d",i+1);
        this.ten = ten;
        this.lop=lop;
        this.gpa = gpa;

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.ns=formatter.format(formatter.parse(ns));
    }

    @Override
    public String toString() {
        return maSV+" "+ten+" "+lop+" "+ ns +" "+String.format("%.2f",gpa);
    }
}
