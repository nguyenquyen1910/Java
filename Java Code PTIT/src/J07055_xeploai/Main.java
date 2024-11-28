package J07055_xeploai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String solveName(String s){
        String res="";
        String[] tmp=s.split("\\s+");
        for(String x : tmp){
            res+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase();
            res+=" ";
        }
        return res.trim();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new SinhVien(i,solveName(sc.nextLine().trim()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for(SinhVien sv : list){
            System.out.println(sv);
        }
    }
}
