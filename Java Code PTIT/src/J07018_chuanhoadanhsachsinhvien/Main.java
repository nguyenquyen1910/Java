package J07018_chuanhoadanhsachsinhvien;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        List<SinhVien> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new SinhVien(i, sc.nextLine(), sc.nextLine() ,sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        list.forEach(System.out::println);
    }
}
