package J05073_tinhtoangiaban;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Order> orders = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            orders.add(new Order(tmp[0], Long.parseLong(tmp[1]), Long.parseLong(tmp[2])));
        }
        orders.forEach(System.out::println);
    }
}
