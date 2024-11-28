package J05010_sapxepdanhsachmathang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<MatHang> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new MatHang(i,sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(list);
        for(MatHang it : list){
            System.out.println(it.toString());
        }
    }
}
