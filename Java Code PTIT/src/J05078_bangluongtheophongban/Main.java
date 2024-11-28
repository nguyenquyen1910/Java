package J05078_bangluongtheophongban;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<PhongBan> listRoom=new ArrayList<>();
        for(int i=0;i<n;i++){
            listRoom.add(new PhongBan(sc.nextLine()));
        }
        int m=Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> listStaff=new ArrayList<>();
        for(int i=0;i<m;i++){
            listStaff.add(new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        String x=sc.nextLine();
        String res="";
        for(PhongBan pb : listRoom){
            if(pb.getId().equals(x)){
                res=pb.getName();
            }
        }
        System.out.println("Bang luong phong "+res+":");
        for(NhanVien nv : listStaff){
            if(nv.getRoleId().equals(x)){
                System.out.println(nv.toString());
            }
        }
    }
}
