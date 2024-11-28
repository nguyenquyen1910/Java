package baocaosanpham;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> products = new ArrayList<Product>();
        for(int i=0;i<n;i++){
            products.add(new Product(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        int m = Integer.parseInt(sc.nextLine());
        List<Customer> customers = new ArrayList<>();
        for(int i=0;i<m;i++){
            customers.add(new Customer(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),sdf.parse(sc.nextLine())));
        }

        for(Customer cus : customers){
            for(Product product : products){
                if(cus.getProductId().equals(product.getId())){
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

