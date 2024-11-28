package J07047_quanlikhachsan;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<KhachSan> listKS = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] tmp=sc.nextLine().trim().split("\\s+");
            listKS.add(new KhachSan(tmp[0],tmp[1],Double.parseDouble(tmp[2]),Double.parseDouble(tmp[3])));
        }
        int m=Integer.parseInt(sc.nextLine());
        List<KhachHang> listKH = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for(int i=0;i<m;i++){
            listKH.add(new KhachHang(i,sc.nextLine(),sc.nextLine(),sdf.parse(sc.nextLine()),sdf.parse(sc.nextLine())));
        }

        for(KhachHang khachHang : listKH){
            for(KhachSan khachSan : listKS){
                if(khachHang.getIdRoom().toLowerCase().charAt(2) == khachSan.getId().toLowerCase().charAt(0)){
                    khachHang.setKhachSan(khachSan);
                }
            }
        }
        Collections.sort(listKH);
        for(KhachHang khachHang : listKH){
            System.out.println(khachHang);
        }

    }
}

/*
2
C THUONG 150 0.03
B VIP 200 0.05
2
Nguyen Van Hoang
55B1
01/01/2021
05/01/2021
Nguyen Trung Dung
04C6
01/01/2021
10/01/2021
 */
