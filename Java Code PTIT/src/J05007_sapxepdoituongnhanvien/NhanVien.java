package J05007_sapxepdoituongnhanvien;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien> {
    private String ma,ten,gt,dc,mst;
    private Date ns,ngay;

    public NhanVien(int i, String ten, String gt, Date ns, String dc, String mst, Date ngay) {
        this.ma = String.format("%05d",i+1);
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.ngay = ngay;
    }

    public String formatDate(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+gt+" "+formatDate(ns)+" "+dc+" "+mst+" "+formatDate(ngay);
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.ns.compareTo(o.ns);
    }
}
