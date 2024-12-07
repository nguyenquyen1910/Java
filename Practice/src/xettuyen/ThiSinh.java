package xettuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ThiSinh {
    private String ma, ten, ngaySinh;
    private double diemLyThuyet, diemThucHanh;
    private double diemThuong;
    private String xepHang;
    private long tongDiem, tuoi;

    public ThiSinh(int i, String ten, String ngaySinh, double diemLyThuyet, double diemThucHanh) throws ParseException {
        this.ma = "PH"+String.format("%02d", i+1);
        this.ten = xuLyTen(ten);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaySinh = sdf.format(sdf.parse(ngaySinh));
        this.tuoi = 2021 - Integer.parseInt(this.ngaySinh.substring(6, 10));
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
        this.diemThuong = xuLyDiemThuong();
        this.tongDiem = Math.min(10, Math.round((diemLyThuyet+diemThucHanh)/2 + diemThuong));
        this.xepHang = xuLyXepHang();
    }

    private String xuLyTen(String name) {
        String[] tmp = name.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for(String it : tmp){
            res.append(it.substring(0, 1).toUpperCase()).append(it.substring(1).toLowerCase()).append(" ");
        }
        return res.toString().trim();
    }

    private double xuLyDiemThuong() {
        if(diemLyThuyet >= 8 && diemThucHanh >= 8){
            return 1.0;
        }
        if(diemLyThuyet >= 7.5 && diemThucHanh >= 7.5){
            return 0.5;
        }
        return 0;
    }

    private String xuLyXepHang() {
        if(tongDiem>=9){
            return "Xuat sac";
        }
        if(tongDiem>=8){
            return "Gioi";
        }
        if(tongDiem>=7){
            return "Kha";
        }
        if(tongDiem>=5){
            return "Trung binh";
        }
        return "Truot";
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+tuoi+" "+tongDiem+" "+xepHang;
    }
}
