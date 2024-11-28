package J05013_tuyendung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<UngVien> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new UngVien(i,sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
        for(UngVien it : list){
            System.out.println(it.toString());
        }
    }
}
