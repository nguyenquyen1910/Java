package chamcong;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<NhanVien> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new NhanVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list);
        for(NhanVien nv : list){
            System.out.println(nv);
        }
    }
}
