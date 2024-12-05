package J07033;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<SinhVien> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for(int i=0;i<n;i++){
            System.out.println(a.get(i).toString());
        }
    }
}
