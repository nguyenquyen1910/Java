package J05022_lietketheolop;

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
            String className=sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+className+":");
            for(SinhVien it : list){
                if(className.equals(it.getClassName())){
                    System.out.println(it.toString());
                }
            }
        }

    }
}
