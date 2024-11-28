package J07056_tinhtiendien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String solveName(String s){
        String res="";
        String[] tmp = s.split("\\s+");
        for(String it : tmp){
            res+=it.substring(0,1).toUpperCase()+it.substring(1).toLowerCase();
            res+=" ";
        }
        return res.trim();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String name = solveName(sc.nextLine().trim());
            String[] tmp = sc.nextLine().trim().split("\\s+");
            String typeElec = tmp[0];
            int startNum = Integer.parseInt(tmp[1]);
            int endNum = Integer.parseInt(tmp[2]);
            list.add(new KhachHang(i,name,typeElec,startNum,endNum));
        }
        Collections.sort(list);
        for(KhachHang it : list){
            System.out.println(it);
        }
    }
}
