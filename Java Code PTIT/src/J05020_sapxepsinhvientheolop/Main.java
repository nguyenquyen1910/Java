package J05020_sapxepsinhvientheolop;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(list);
        for(SinhVien it : list){
            System.out.println(it.toString());
        }
    }
}
