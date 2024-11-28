package J05030_bangdiemthanhphan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String id = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            String className = sc.nextLine().trim();
            List<Double> score = new ArrayList<>();
            for(int j=0;j<3;j++){
                score.add(Double.parseDouble(sc.nextLine().trim()));
            }
            list.add(new SinhVien(id, name, className, score));
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.println((i+1)+" "+list.get(i));
        }
    }
}
