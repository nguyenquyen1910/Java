package J05021_sapxeptheomasv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();
        while (sc.hasNext()) {
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(SinhVien it : list){
            System.out.println(it.toString());
        }
    }
}
