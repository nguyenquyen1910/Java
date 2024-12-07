package tinhtienphong;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class KhachHang implements Comparable<KhachHang> {
    private String ma, ten, maPhong, ngayNhan, ngayDi;
    private long tienDichVu, giaPhong, soNgayO, tongTien;

    public KhachHang(int i, String ten, String maPhong, String ngayNhan, String ngayDi, long tienDichVu) throws ParseException {
        this.ma = "KH"+String.format("%02d", i+1);
        this.ten = xuLyTen(ten);
        this.maPhong = maPhong;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayNhan = sdf.format(sdf.parse(ngayNhan));
        this.ngayDi = sdf.format(sdf.parse(ngayDi));
        this.tienDichVu = tienDichVu;
        this.giaPhong = tinhGiaPhong();
        this.soNgayO = ((sdf.parse(ngayDi)).getTime() - (sdf.parse(ngayNhan)).getTime()) / (1000*60*60*24) + 1;
        this.tongTien = this.giaPhong * this.soNgayO + this.tienDichVu;
    }

    private String xuLyTen(String ten) {
        String res="";
        String[] tmp = ten.trim().split("\\s+");
        for(String it : tmp){
            res+=it.substring(0,1).toUpperCase()+it.substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }

    private long tinhGiaPhong() {
        if(maPhong.startsWith("1")){
            return 25;
        }
        if(maPhong.startsWith("2")){
            return 34;
        }
        if(maPhong.startsWith("3")){
            return 50;
        }
        return 80;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+maPhong+" "+soNgayO+" "+tongTien;
    }

    @Override
    public int compareTo(KhachHang o) {
        return Long.compare(o.tongTien, this.tongTien);
    }
}
