package quanlybaitapnhom1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m=sc.nextInt();
        sc.nextLine();
        List<SinhVien> sinhVienList = new ArrayList<>();
        for(int i=0;i<n;i++){
            sinhVienList.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }

        List<BaiTap> baiTapList = new ArrayList<>();
        for(int i=0;i<m;i++){
            baiTapList.add(new BaiTap(i, sc.nextLine()));
        }

        for(SinhVien sv : sinhVienList){
            for(BaiTap bt : baiTapList){
                if(sv.getMaBT()==bt.getMaBT()){
                    sv.setBaiTap(bt);
                    break;
                }
            }
        }


        int q = Integer.parseInt(sc.nextLine());
        while(q-->0) {
            int maBT = Integer.parseInt(sc.nextLine());
            String tenBT = "";
            System.out.println("DANH SACH NHOM "+maBT+":");
            List<SinhVien> res = new ArrayList<>();
            for(SinhVien sv : sinhVienList){
                if(sv.getMaBT()==maBT){
                    tenBT=sv.getBaiTap().getTenBT();
                    res.add(sv);
                }
            }
            res.forEach(System.out::println);
            System.out.println("Bai tap dang ky: "+tenBT);
        }
    }
}
