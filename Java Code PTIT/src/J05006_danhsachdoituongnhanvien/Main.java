package J05006_danhsachdoituongnhanvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<NhanVien> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new NhanVien(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        for(NhanVien nv:a){
            System.out.println(nv.toString());
        }
    }
}
