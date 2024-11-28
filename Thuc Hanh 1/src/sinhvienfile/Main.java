package sinhvienfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<SinhVien> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String className = sc.nextLine();
            String email = sc.nextLine();
            String phone = sc.nextLine();
            list.add(new SinhVien(id, name, className, email, phone));
        }
        Collections.sort(list);
        for(SinhVien sv : list) {
            System.out.println(sv);
        }
    }
}