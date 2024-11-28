package thuctapcoso;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<SinhVien> sinhViens = new ArrayList<>();
        for(int i=0;i<n;i++){
            sinhViens.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Scanner sc1 = new Scanner(new File("DETAI.in"));
        int m=Integer.parseInt(sc1.nextLine());
        List<DeTai> deTais = new ArrayList<>();
        for(int i=0;i<m;i++){
            deTais.add(new DeTai(i,sc1.nextLine(),sc1.nextLine()));
        }
        Scanner sc2 = new Scanner(new File("NHIEMVU.in"));
        int o=Integer.parseInt(sc2.nextLine());
        List<NhiemVu> nhiemVus = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] info = sc2.nextLine().trim().split("\\s+");
            String idSv = info[0];
            String idTopic = info[1];
            nhiemVus.add(new NhiemVu(idSv,idTopic));
        }
        for(NhiemVu nv : nhiemVus){
            for(SinhVien sv : sinhViens){
                if(nv.getIdSv().equals(sv.getId())){
                    nv.setSinhVien(sv);
                }
            }
        }
        for(NhiemVu nv : nhiemVus){
            for(DeTai dt : deTais){
                if(nv.getIdTopic().equals(dt.getIdTopic())){
                    nv.setDeTai(dt);
                }
            }
        }
        Collections.sort(nhiemVus);
        for(NhiemVu nv : nhiemVus){
            System.out.println(nv);
        }
    }
}

/*
2
B19DCCN999
Ngo Quang Huy
0976544443
B19DCCN999@stu.ptit.edu.vn
B19DCCN997
Nguyen Manh Cuong
0987654321
B19DCCN997@stu.ptit.edu.vn
3
Nguyen Hoai Nam
Xay dung website tim kiem nha thong minh
Tran Thanh Cong
Xay dung he thong diem danh bang nhan dang van tay
Le Thi My Uyen
Xay dung website cap nhat tin tuc
2
B19DCCN997 DT001
B19DCCN999 DT002
 */
