package J05076_nhapxuathang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> products = new ArrayList<>();
        for(int i=0;i<n;i++){
            products.add(new Product(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        List<Stats> stats = new ArrayList<>();
        for(int i=0;i<m;i++){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            stats.add(new Stats(tmp[0], Integer.parseInt(tmp[1]), Long.parseLong(tmp[2]), Integer.parseInt(tmp[3])));
        }

        for(Stats it : stats){
            for(Product p : products){
                if(it.getProductId().equals(p.getId())){
                    it.setProduct(p);
                }
            }
        }

        stats.forEach(System.out::println);
    }
}
