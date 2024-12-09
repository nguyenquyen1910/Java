package bangdiemtheolop;

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
        List<SinhVien> danhSachSV = new ArrayList<>();
        for(int i=0;i<n;i++){
            danhSachSV.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        int m = Integer.parseInt(sc1.nextLine());
        List<MonHoc> danhSachMH = new ArrayList<>();
        for(int i=0;i<m;i++){
            danhSachMH.add(new MonHoc(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine())));
        }

        Scanner sc2 = new Scanner(new File("BANGDIEM.in"));
        int o = Integer.parseInt(sc2.nextLine());
        List<BangDiem> danhSachBD = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] tmp = sc2.nextLine().trim().split("\\s+", 3);
            danhSachBD.add(new BangDiem(tmp[0], tmp[1], tmp[2]));
        }

        for(BangDiem bd : danhSachBD){
            for(SinhVien sv : danhSachSV){
                if(bd.getMaSV().equals(sv.getMaSV())){
                    bd.setSinhVien(sv);
                    break;
                }
            }
        }

        for(BangDiem bd : danhSachBD){
            for(MonHoc mh : danhSachMH){
                if(bd.getMaMH().equals(mh.getMaMH())){
                    bd.setMonHoc(mh);
                    break;
                }
            }
        }

        int q = Integer.parseInt(sc2.nextLine());
        while(q-->0) {
            String query = sc2.nextLine();
            String lop = "";
            List<BangDiem> res = new ArrayList<>();
            for(BangDiem bd : danhSachBD){
                if(bd.getSinhVien().getLop().equals(query)){
                    lop = bd.getSinhVien().getLop();
                    res.add(bd);
                }
            }
            Collections.sort(res);
            System.out.println("BANG DIEM lop "+lop+":");
            res.forEach(System.out::println);
        }
    }
}
