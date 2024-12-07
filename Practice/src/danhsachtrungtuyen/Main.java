package danhsachtrungtuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ThiSinh(sc.nextLine().trim(), sc.nextLine().trim(), Double.parseDouble(sc.nextLine().trim()), Double.parseDouble(sc.nextLine().trim()), Double.parseDouble(sc.nextLine().trim())));
        }

        int chiTieu = Integer.parseInt(sc.nextLine());
        Collections.sort(list);
        list.forEach(e -> {
            e.setDiemChuan(list.get(chiTieu-1).getTongDiem());
        });
        System.out.println(String.format("%.1f", list.get(0).getDiemChuan()));
        list.forEach(System.out::println);
    }
}
