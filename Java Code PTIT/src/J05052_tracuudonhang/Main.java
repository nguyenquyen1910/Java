package J05052_tracuudonhang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Order> orders = new ArrayList<>();
        for(int i=0;i<n;i++){
            orders.add(new Order(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(orders);
        orders.forEach(System.out::println);
    }
}
