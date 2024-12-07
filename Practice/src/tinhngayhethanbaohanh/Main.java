package tinhngayhethanbaohanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<SanPham> sanPhamList = new ArrayList<>();
        for(int i=0;i<n;i++){
            sanPhamList.add(new SanPham(sc.nextLine().trim(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }

        int m = Integer.parseInt(sc.nextLine());
        List<KhachHang> khachHangList = new ArrayList<>();
        for(int i=0;i<m;i++){
            khachHangList.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine().trim(), Long.parseLong(sc.nextLine()), sc.nextLine()));
        }

        for(KhachHang khachHang:khachHangList){
            for(SanPham sanPham:sanPhamList){
                if(khachHang.getMaSP().equals(sanPham.getMaSP())){
                    khachHang.setSanPham(sanPham);
                    break;
                }
            }
        }

        Collections.sort(khachHangList);
        khachHangList.forEach(System.out::println);
    }
}
