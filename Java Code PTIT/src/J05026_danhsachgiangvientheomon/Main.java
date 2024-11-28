package J05026_danhsachgiangvientheomon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String solveString(String s){
        String[] tmp=s.split("\\s+");
        String res="";
        for(String x : tmp){
            x=x.toUpperCase();
            res+=x.charAt(0);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new GiangVien(i,sc.nextLine(),sc.nextLine()));
        }
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s=sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN BO MON "+solveString(s)+":");
            for(GiangVien it : list){
                if(it.getNameMajor().equals(solveString(s))){
                    System.out.println(it.toString());
                }
            }
        }
    }
}
