package J05027_timkiemgiangvien;

import java.util.ArrayList;
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
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String tmp=sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+tmp+":");
            tmp=tmp.toLowerCase();
            for(GiangVien x : list){
                if(x.getNameLower().contains(tmp)){
                    System.out.println(x.toString());
                }
            }
        }
    }
}
