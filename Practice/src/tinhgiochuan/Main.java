package tinhgiochuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<MonHoc> monHocList = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] info = sc.nextLine().trim().split(" ", 2);
            monHocList.add(new MonHoc(info[0], info[1]));
        }

        Scanner sc1 = new Scanner(new File("GIANGVIEN.in"));
        int m = Integer.parseInt(sc1.nextLine());
        List<GiangVien> giangVienList = new ArrayList<>();
        for(int i=0;i<m;i++){
            String[] info = sc1.nextLine().trim().split(" ", 2);
            giangVienList.add(new GiangVien(info[0], info[1]));
        }

        Scanner sc2 = new Scanner(new File("GIOCHUAN.in"));
        int o = Integer.parseInt(sc2.nextLine());
        List<GioChuan> gioChuanList = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] info = sc2.nextLine().trim().split(" ", 3);
            gioChuanList.add(new GioChuan(info[0], info[1], Double.parseDouble(info[2])));
        }

        for(GioChuan gioChuan : gioChuanList){
            for(GiangVien giangVien : giangVienList){
                if(gioChuan.getMaGV().equals(giangVien.getMaGV())){
                    giangVien.addTime(gioChuan.getTime());
                }
            }
        }

        giangVienList.forEach(System.out::println);
    }
}
