package danhsachsinhvien1;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {
    private String ma;
    private String ten;
    private String lop;
    private String ngaysinh;
    private double gpa;

    public SinhVien(int id, String ten, String lop, String ngaysinh, double gpa) throws ParseException {
        this.ma = "B20DCCN"+String.format("%03d",id+1);
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh = sdf.format(sdf.parse(ngaysinh));
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+lop+" "+ngaysinh+" "+String.format("%.2f", gpa);
    }
}
