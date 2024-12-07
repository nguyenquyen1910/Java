package quanlykhachsan;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Phong> danhSachPhong = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] tmp = sc.nextLine().trim().split(" ", 4);
            danhSachPhong.add(new Phong(tmp[0], tmp[1], Long.parseLong(tmp[2]), Double.parseDouble(tmp[3])));
        }

        int m = Integer.parseInt(sc.nextLine());
        List<KhachHang> danhSachKhachHang = new ArrayList<>();
        for(int i=0;i<m;i++){
            danhSachKhachHang.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        for(KhachHang khachHang : danhSachKhachHang){
            for(Phong phong : danhSachPhong){
                if(khachHang.getMaPhong().charAt(2)==phong.getMa().charAt(0)){
                    khachHang.setPhong(phong);
                    break;
                }
            }
        }

        Collections.sort(danhSachKhachHang);
        danhSachKhachHang.forEach(System.out::println);
    }
}
