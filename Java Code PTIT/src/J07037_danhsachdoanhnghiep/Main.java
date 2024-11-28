package J07037_danhsachdoanhnghiep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<DoanhNghiep> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new DoanhNghiep(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a);
        for(DoanhNghiep x : a){
            System.out.println(x.toString());
        }
    }
}
