package muahang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        List<Product> products = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            products.add(new Product(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }

        int m = Integer.parseInt(sc.nextLine());
        List<Customer> customers = new ArrayList<>();
        for(int i=0;i<m;i++){
            customers.add(new Customer(i, sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine()));
        }

        for(Customer cus : customers){
            for(Product product : products){
                if(cus.getProdId().equals(product.getProdId())){
                    cus.setProduct(product);
                }
            }
        }
        Collections.sort(customers);
        for(Customer cus : customers){
            System.out.println(cus);
        }
    }
}
/*
2
KC740
May khoan KC1
39
18
KC742
May cat KC2
46
12
2
Le Ngoc Long
Hoang Mai
KC740
11
21/05/2009
Nguyen Sao Mai
Hoan Kiem
KC742
17
06/02/2009
 */
