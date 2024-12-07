package quanlykhachsan;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class KhachHang implements Comparable<KhachHang> {
    private String maKH, tenKH, maPhong, ngayDen, ngayDi;
    private long ngayO;
    private double tongTien, giamGia;
    private Phong phong;

    public KhachHang(int i, String tenKH, String maPhong, String ngayDen, String ngayDi) throws ParseException {
        this.maKH = "KH"+String.format("%02d", i+1);
        this.tenKH = tenKH;
        this.maPhong = maPhong;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayDen = sdf.format(sdf.parse(ngayDen));
        this.ngayDi = sdf.format(sdf.parse(ngayDi));
        this.ngayO = (sdf.parse(ngayDi).getTime()-sdf.parse(ngayDen).getTime()) / (1000*60*60*24);
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
        this.tongTien = xuLyTongTien();
        this.giamGia = xuLyGiamGia();
    }

    private double xuLyGiamGia() {
        if(ngayO >= 30){
            return tongTien*0.06;
        }
        if(ngayO >= 20){
            return tongTien*0.04;
        }
        if(ngayO >= 10){
            return tongTien*0.02;
        }
        return 0;
    }

    private double xuLyTongTien() {
        if(ngayO ==0) {
            return (phong.getGiaNgay() + phong.getGiaNgay() * phong.getPhiPhucVu());
        }
        return (phong.getGiaNgay() + phong.getGiaNgay() * phong.getPhiPhucVu()) * ngayO;
    }

    @Override
    public String toString() {
        return maKH+" "+tenKH+" "+maPhong+" "+ngayO+" "+String.format("%.2f", tongTien - giamGia);
    }

    @Override
    public int compareTo(KhachHang o) {
        return Long.compare(o.ngayO, this.ngayO);
    }
}
