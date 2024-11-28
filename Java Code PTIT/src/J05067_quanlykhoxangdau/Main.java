package J05067_quanlykhoxangdau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Invoice> invoices = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            invoices.add(new Invoice(tmp[0], Integer.parseInt(tmp[1])));
        }
        Collections.sort(invoices);
        invoices.forEach(System.out::println);
    }
}
