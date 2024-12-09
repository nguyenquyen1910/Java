package hoadon2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> listKH = new ArrayList<>();
        for(int i=0;i<n;i++){
            listKH.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Scanner sc1 = new Scanner(new File("MH.in"));
        int m = Integer.parseInt(sc1.nextLine());
        List<MatHang> listMH = new ArrayList<>();
        for(int i=0;i<m;i++){
            listMH.add(new MatHang(i, sc1.nextLine(), sc1.nextLine(), Long.parseLong(sc1.nextLine()), Long.parseLong(sc1.nextLine())));
        }

        Scanner sc2 = new Scanner(new File("HD.in"));
        int o = Integer.parseInt(sc2.nextLine());
        List<HoaDon> listHD = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] tmp = sc2.nextLine().trim().split("\\s+", 3);
            listHD.add(new HoaDon(i, tmp[0], tmp[1], Integer.parseInt(tmp[2])));
        }

        for(HoaDon hoaDon : listHD){
            for(KhachHang khachHang : listKH){
                if(hoaDon.getMaKH().equals(khachHang.getMa())){
                    hoaDon.setKhachHang(khachHang);
                    break;
                }
            }
        }

        for(HoaDon hoaDon : listHD){
            for(MatHang matHang : listMH){
                if(hoaDon.getMaMH().equals(matHang.getMa())){
                    hoaDon.setMatHang(matHang);
                    break;
                }
            }
        }

        listHD.forEach(System.out::println);
    }
}
