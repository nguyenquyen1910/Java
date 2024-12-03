package J07047_quanlikhachsan;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<KhachSan> listKS = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] tmp=sc.nextLine().trim().split("\\s+");
            listKS.add(new KhachSan(tmp[0],tmp[1],Double.parseDouble(tmp[2]),Double.parseDouble(tmp[3])));
        }
        int m=Integer.parseInt(sc.nextLine());
        List<KhachHang> listKH = new ArrayList<>();
        for(int i=0;i<m;i++){
            listKH.add(new KhachHang(i,sc.nextLine(),sc.nextLine(),sc.nextLine(), sc.nextLine()));
        }

        for(KhachHang khachHang : listKH){
            for(KhachSan khachSan : listKS){
                if(khachHang.getIdRoom().toLowerCase().charAt(2) == khachSan.getId().toLowerCase().charAt(0)){
                    khachHang.setKhachSan(khachSan);
                    break;
                }
            }
        }
        Collections.sort(listKH);
        listKH.forEach(System.out::println);

    }
}
