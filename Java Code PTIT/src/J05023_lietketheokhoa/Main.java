package J05023_lietketheokhoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            int schoolYear=sc.nextInt();
            System.out.println("DANH SACH SINH VIEN KHOA "+schoolYear+":");
            for(SinhVien it : list){
                if(schoolYear == Integer.parseInt("20"+it.getClassName().substring(1,3))){
                    System.out.println(it.toString());
                }
            }
        }

    }
}
