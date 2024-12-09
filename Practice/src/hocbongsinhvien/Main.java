package hocbongsinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        List<SinhVien> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten = sc.nextLine();
            String[] tmp = sc.nextLine().trim().split("\\s+", 2);
            list.add(new SinhVien(ten, Double.parseDouble(tmp[0]), Integer.parseInt(tmp[1]), i));
        }

        Collections.sort(list);
        int i = m;
        while(i<n) {
            if(list.get(i).getGpa() == list.get(i-1).getGpa()){
                ++i;
            }
            else break;
        }
        while(i<n){
            list.get(i).setTrangThai("KHONG");
            ++i;
        }
        for(i=0;i<n;i++){
            for(SinhVien sinhVien : list){
                if(sinhVien.getIndex() == i){
                    System.out.println(sinhVien);
                }
            }
        }
    }
}
