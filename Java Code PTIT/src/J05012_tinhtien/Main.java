package J05012_tinhtien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> products = new ArrayList<>();
        for(int i=0;i<n;i++){
            products.add(new Product(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));
        }
        Collections.sort(products);
        for(Product p : products){
            System.out.println(p);
        }
    }
}
