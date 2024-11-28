package J05004_danhsachdoituongsv2;

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
    private String formatName(String name) {
        String[] tmp = name.trim().split("\\s+");
        String res = "";
        for (String it : tmp) {
            res += it.substring(0, 1).toUpperCase() + it.substring(1).toLowerCase() + " ";
        }
        return res.substring(0, res.length() - 1);
    }

    @Override
    public String toString() {
        return maSV+" "+formatName(ten)+" "+lop+" "+ ns +" "+String.format("%.2f",gpa);
    }
}
