package J07057_diemtuyensinh;

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
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ThiSinh(i,solveName(sc.nextLine().trim()),Double.parseDouble(sc.nextLine()),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for(ThiSinh i : list){
            System.out.println(i);
        }
    }
}
