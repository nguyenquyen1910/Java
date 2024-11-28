package J07051_tinhtienphong;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n=Integer.parseInt(sc.nextLine());
        List<KhachHang> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new KhachHang(i,sc.nextLine().trim(),sc.nextLine().trim(),
                    sdf.parse(sc.nextLine()),sdf.parse(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for(KhachHang khachHang:list){
            System.out.println(khachHang);
        }
    }
}
