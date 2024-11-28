package J07034_DanhSachMonHoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        List<DanhSachMonHoc> a = new ArrayList<DanhSachMonHoc>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int soTin = Integer.parseInt(sc.nextLine());
            a.add(new DanhSachMonHoc(id, name, soTin));
        }
        Collections.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i).toString());
        }
    }
}
