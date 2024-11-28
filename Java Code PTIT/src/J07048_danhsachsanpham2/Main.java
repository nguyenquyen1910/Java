package J07048_danhsachsanpham2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<SanPham> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new SanPham(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for(SanPham it : list){
            System.out.println(it);
        }
    }
}
