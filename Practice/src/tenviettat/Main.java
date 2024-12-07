package tenviettat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<HoTen> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new HoTen(sc.nextLine().trim()));
        }
        Collections.sort(list);

        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String query = sc.nextLine().trim();
            list.forEach(e -> {
                if(e.compare(query)){
                    System.out.println(e);
                }
            });
        }
    }
}
