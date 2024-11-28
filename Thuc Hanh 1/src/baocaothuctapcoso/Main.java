package baocaothuctapcoso;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
        Scanner sc2 = new Scanner(new File("HOIDONG.in"));
        int o = Integer.parseInt(sc2.nextLine());
        List<HoiDong> hoiDongList = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] tmp=sc2.nextLine().trim().split("\\s+");
            hoiDongList.add(new HoiDong(tmp[0],tmp[1],tmp[2]));
        }
        for(HoiDong hd : hoiDongList){
            for(SinhVien sv : sinhViens){
                if(hd.getIdSV().equals(sv.getId())){
                    hd.setSinhVien(sv);
                }
            }
        }
        for(HoiDong hoiDong : hoiDongList){
            for(DeTai deTai : deTais){
                if(deTai.getIdTopic().equals(hoiDong.getIdDT())){
                    hoiDong.setDeTai(deTai);
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for(HoiDong hoiDong : hoiDongList){
            set.add(Integer.parseInt(String.valueOf(hoiDong.getIdHD().charAt(2))));
        }
        for(int i=1;i<=8;i++){
            if(set.contains(i)){
                System.out.println("Danh sach sinh vien hoi dong "+i);
                for(HoiDong hoiDong : hoiDongList){
                    if(Integer.parseInt(String.valueOf(hoiDong.getIdHD().charAt(2)))==i){
                        System.out.println(hoiDong);
                    }
                }
            }
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
B19DCCN997 DT001 HD2
B19DCCN999 DT002 HD1
 */
