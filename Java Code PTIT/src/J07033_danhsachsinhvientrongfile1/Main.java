package J07033_danhsachsinhvientrongfile1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String nameRemake(String s) {
        if(s.length()==1){
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public static String solveFullName(String s){
        String[] tmp=s.split("\\s+");
        for(int i=0;i<tmp.length;i++){
            tmp[i]=nameRemake(tmp[i]);
        }
        return String.join(" ",tmp);
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<SinhVien> a = new ArrayList<SinhVien>();
        for(int i=0;i<n;i++){
            String maSV=sc.nextLine();
            String tenSV=sc.nextLine();
            String lop=sc.nextLine();
            String email=sc.nextLine();
            a.add(new SinhVien(maSV,solveFullName(tenSV),lop,email));
        }
        Collections.sort(a);
        for(int i=0;i<n;i++){
            System.out.println(a.get(i).toString());
        }
    }
}
