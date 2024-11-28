package J05025_danhsachgiangvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<GiangVien> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new GiangVien(i,sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list);
        for(GiangVien x : list){
            System.out.println(x.toString());
        }
    }
}
