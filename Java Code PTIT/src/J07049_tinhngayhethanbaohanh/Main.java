package J07049_tinhngayhethanbaohanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Product> products = new ArrayList<>();
        for(int i=0;i<n;i++){
            products.add(new Product(sc.nextLine().trim(), sc.nextLine().trim(), Long.parseLong(sc.nextLine().trim()), Integer.parseInt(sc.nextLine().trim())));
        }

        int m = Integer.parseInt(sc.nextLine());
        List<Customer> customers = new ArrayList<>();
        for(int i=0;i<m;i++){
            customers.add(new Customer(i, sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), Integer.parseInt(sc.nextLine().trim()), sc.nextLine().trim()));
        }

        for(Customer customer : customers){
            for(Product product : products){
                if(customer.getProId().equals(product.getProId())){
                    customer.setProduct(product);
                    break;
                }
            }
        }

        Collections.sort(customers);
        customers.forEach(System.out::println);
    }
}
