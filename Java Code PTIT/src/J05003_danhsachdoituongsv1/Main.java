package J05003_danhsachdoituongsv1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            list.add(new SinhVien(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine())));
        }
        for(SinhVien a : list){
            System.out.println(a.toString());
        }
    }
}
