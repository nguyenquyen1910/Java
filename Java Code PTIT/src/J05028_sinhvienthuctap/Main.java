package J05028_sinhvienthuctap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<TapDoan> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new TapDoan(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            int a=sc.nextInt(),b=sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+ " DEN "+b+" SINH VIEN:");
            for(TapDoan x : list){
                if(a<=x.getStudents() && x.getStudents()<=b){
                    System.out.println(x.toString());
                }
            }
        }

    }
}
