package lietkesinhvientheonghanh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        int q = Integer.parseInt(sc.nextLine());
        while(q-->0) {
            String query = sc.nextLine().trim().toLowerCase();
            System.out.println("DANH SACH SINH VIEN NGANH "+query.toUpperCase()+":");
            for(SinhVien sv : list) {
                if(sv.getNganh().equals(query)) {
                    System.out.println(sv);
                }
            }
        }
    }
}
