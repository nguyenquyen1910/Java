package lietkenhapxuathangtheonhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<DonHang> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new DonHang(sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        String query = sc.nextLine();
        list.forEach(e -> {
            if(e.getMaHang().substring(0,1).equals(query)){
                System.out.println(e);
            }
        });
    }
}
