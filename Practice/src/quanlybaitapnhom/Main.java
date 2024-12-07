package quanlybaitapnhom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> sinhVienList = new ArrayList<>();
        for(int i=0;i<n;i++){
            sinhVienList.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Scanner sc1 = new Scanner(new File("BAITAP.in"));
        int m = Integer.parseInt(sc1.nextLine());
        List<BaiTap> baiTapList = new ArrayList<>();
        for(int i=0;i<m;i++){
            baiTapList.add(new BaiTap(i, sc1.nextLine()));
        }

        Scanner sc2 = new Scanner(new File("NHOM.in"));
        List<Nhom> nhomList = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] info = sc2.nextLine().trim().split(" ", 2);
            nhomList.add(new Nhom(info[0], info[1]));
        }

        for(Nhom nhom : nhomList){
            for(SinhVien sinhVien : sinhVienList){
                if(nhom.getMaSV().equals(sinhVien.getMaSV())){
                    nhom.setSinhVien(sinhVien);
                    break;
                }
            }
        }

        for(Nhom nhom : nhomList){
            for(BaiTap baiTap : baiTapList){
                if(nhom.getMaBT().equals(baiTap.getMaBT())){
                    nhom.setBaiTap(baiTap);
                    break;
                }
            }
        }

        Collections.sort(nhomList);
        nhomList.forEach(System.out::println);
    }
}
