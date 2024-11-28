package J05057_bangdiemtuyensinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<ThiSinh> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ThiSinh(sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        for(ThiSinh x : list){
            System.out.println(x.toString());
        }
    }
}
