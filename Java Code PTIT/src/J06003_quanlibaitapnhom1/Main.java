package J06003_quanlibaitapnhom1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        sc.nextLine();
        List<SinhVien> listSV=new ArrayList<>();
        List<BaiTapLon> listEx=new ArrayList<>();
        for(int i=0;i<m;i++){
            listSV.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        for(int i=0;i<n;i++){
            listEx.add(new BaiTapLon(i,sc.nextLine()));
        }
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            int group=Integer.parseInt(sc.nextLine());
            System.out.println("DANH SACH NHOM "+group+":");
            for(SinhVien sv : listSV){
                if(sv.getGroup()==group){
                    System.out.println(sv.toString());
                }
            }
            System.out.println("Bai tap dang ky: "+listEx.get(group-1).getName());
        }
    }
}
