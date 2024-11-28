package J05048_bangtheodoixuatnhaphang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Invoice> invoices = new ArrayList<>();
        for(int i=0;i<n;i++){
            invoices.add(new Invoice(sc.nextLine(),Long.parseLong(sc.nextLine())));
        }

        invoices.forEach(System.out::println);
    }
}
