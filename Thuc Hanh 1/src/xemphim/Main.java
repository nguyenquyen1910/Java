package xemphim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        ArrayList<TheLoai> listTL=new ArrayList<>();
        for(int i=0;i<n;i++){
            listTL.add(new TheLoai(i,sc.nextLine()));
        }
        ArrayList<ThongTinPhim> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            list.add(new ThongTinPhim(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for(ThongTinPhim ttp : list){
            for(TheLoai tl : listTL){
                if(ttp.getTypeId().equals(tl.getId())){
                    ttp.setTheLoai(tl);
                    System.out.println(ttp.toString());
                }
            }
        }
    }
}
