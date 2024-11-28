package J06004_quanlybaitapnhom2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> listSV=new ArrayList<>();
        for(int i=0;i<n;i++){
            listSV.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        ArrayList<BaiTapNhom> listBt=new ArrayList<>();
        for(int i=0;i<m;i++){
            listBt.add(new BaiTapNhom(i,sc.nextLine()));
        }
        Collections.sort(listSV);
        for(SinhVien sv : listSV){
            for(BaiTapNhom bt : listBt){
                if(sv.getExId()==bt.getId()){
                    sv.setBaiTapNhom(bt);
                    System.out.println(sv.toString());
                }
            }
        }
    }
}
