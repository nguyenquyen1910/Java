package J05017_hoadontiennuoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Customer> customers = new ArrayList<>();
        for(int i=0;i<n;i++){
            customers.add(new Customer(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(customers);
        customers.forEach(System.out::println);
    }
}
