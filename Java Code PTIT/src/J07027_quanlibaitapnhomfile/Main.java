package J07027_quanlibaitapnhomfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        int n=Integer.parseInt(sc1.nextLine());
        List<SinhVien> list1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            list1.add(new SinhVien(sc1.nextLine(),sc1.nextLine(),sc1.nextLine()));
        }

        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        int m=Integer.parseInt(sc2.nextLine());
        List<BaiTap> list2 = new ArrayList<>();
        for(int i=0;i<m;i++){
            list2.add(new BaiTap(i,sc2.nextLine()));
        }

        Scanner sc3 = new Scanner(new File("NHOM.in"));
        List<Nhom> list3 = new ArrayList<>();
        for(int i=0;i<n;i++){
            list3.add(new Nhom(sc3.nextLine()));
        }

        for(Nhom nhom : list3){
            for(SinhVien sinhVien : list1){
                if(nhom.getIdSV().equals(sinhVien.getId())){
                    nhom.setSinhVien(sinhVien);
                }
            }
        }
        for(Nhom nhom : list3){
            for(BaiTap baiTap : list2){
                if(nhom.getIdEx()==baiTap.getId()){
                    nhom.setBaiTap(baiTap);
                }
            }
        }
        Collections.sort(list3);
        for(Nhom nhom : list3){
            System.out.println(nhom);
        }
    }
}
