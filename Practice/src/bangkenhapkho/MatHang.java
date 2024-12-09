package bangkenhapkho;

import java.util.HashMap;
import java.util.Map;

public class MatHang {
    private String ma, ten;
    private int soLuong;
    private static Map<String, Integer> map = new HashMap<>();
    private long donGia, chietKhau, thanhTien;

    public MatHang(String ten, int soLuong, long donGia) {
        this.ten = ten;
        this.ma = xuLyMa();
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = tinhTienChietKhau();
        this.thanhTien = donGia * soLuong - this.chietKhau;
    }

    private String xuLyMa() {
        String res="";
        String[] tmp = ten.toUpperCase().split("\\s+");
        for(int i=0;i<2;i++){
            res+=tmp[i].charAt(0);
        }
        map.put(res,map.getOrDefault(res,0)+1);
        res += String.format("%02d", map.get(res));
        return res;
    }

    private long tinhTienChietKhau() {
        if(soLuong>10) {
            return (long) (donGia*soLuong*0.05);
        }
        if(soLuong>=8) {
            return (long) (donGia*soLuong*0.02);
        }
        if(soLuong >= 5){
            return (long) (donGia*soLuong*0.01);
        }
        return 0;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+chietKhau+" "+thanhTien;
    }
}
