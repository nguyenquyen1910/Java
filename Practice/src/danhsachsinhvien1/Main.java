package danhsachsinhvien1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> sinhVienList = new ArrayList<>();
        for(int i=0;i<n;i++){
            sinhVienList.add(new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }

        sinhVienList.forEach(System.out::println);
    }
}
