package J07010_danhsachsinhvienfile2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        ArrayList<SinhVien> list = new ArrayList<SinhVien>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            list.add(new SinhVien(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine())));
        }
        for(SinhVien a : list){
            System.out.println(a.toString());
        }
    }
}
