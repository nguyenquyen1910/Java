package bangtinhgiochuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<MonHoc> danhSachMH = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] tmp = sc.nextLine().trim().split("\\s+", 2);
            danhSachMH.add(new MonHoc(tmp[0], tmp[1]));
        }

        Scanner sc1 = new Scanner(new File("GIANGVIEN.in"));
        int m = Integer.parseInt(sc1.nextLine());
        List<GiangVien> danhSachGV = new ArrayList<>();
        for(int i=0;i<m;i++){
            String[] tmp = sc1.nextLine().trim().split("\\s+", 2);
            danhSachGV.add(new GiangVien(tmp[0], tmp[1]));
        }

        Scanner sc2 = new Scanner(new File("GIOCHUAN.in"));
        int o = Integer.parseInt(sc2.nextLine());
        List<GioChuan> danhSachGC = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] tmp = sc2.nextLine().trim().split("\\s+", 3);
            danhSachGC.add(new GioChuan(tmp[0], tmp[1], Double.parseDouble(tmp[2])));
        }

        for(GioChuan gioChuan : danhSachGC){
            for(GiangVien giangVien : danhSachGV) {
                if(gioChuan.getIdGV().equals(giangVien.getMa())){
                    giangVien.addTime(gioChuan.getTime());
                    gioChuan.setGiangVien(giangVien);
                    break;
                }
            }
        }

        danhSachGV.forEach(System.out::println);
    }
}
