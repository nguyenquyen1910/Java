package lietkenhanvientheonhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<NhanVien> danhSach = new ArrayList<>();
        int cntGD=0, cntTP=0, cntPP=0;
        for(int i=0;i<n;i++){
            String[] tmp = sc.nextLine().trim().split("\\s+", 2);
            String ma = tmp[0];
            String ten = tmp[1];
            NhanVien nhanVien = new NhanVien(ma,ten);
            if(nhanVien.getMa().startsWith("GD") && cntGD>=1){
                nhanVien.setChucVu("NV");
            }
            else if(nhanVien.getMa().startsWith("TP") && cntTP>=3){
                nhanVien.setChucVu("NV");
            }
            else if(nhanVien.getMa().startsWith("PP") && cntPP>=3){
                nhanVien.setChucVu("NV");
            }

            if(nhanVien.getMa().startsWith("GD")){
                cntGD++;
            }
            if(nhanVien.getMa().startsWith("TP")){
                cntTP++;
            }
            if(nhanVien.getMa().startsWith("PP")){
                cntPP++;
            }
            danhSach.add(nhanVien);
        }

        Collections.sort(danhSach);
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0) {
            String query = sc.nextLine().toUpperCase();
            danhSach.forEach(e -> {
                if(e.getChucVu().toUpperCase().equals(query)){
                    System.out.println(e);
                }
            });
            System.out.println();
        }
    }
}
