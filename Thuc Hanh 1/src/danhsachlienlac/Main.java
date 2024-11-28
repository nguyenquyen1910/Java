package danhsachlienlac;

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
        while(sc.hasNextLine()) {
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for (SinhVien it : list) {
            System.out.println(it);
        }
    }
}
