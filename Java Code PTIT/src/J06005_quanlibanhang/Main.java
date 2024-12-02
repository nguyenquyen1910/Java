package J06005_quanlibanhang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Customer> customers=new ArrayList<>();
        for(int i=0;i<n;i++){
            customers.add(new Customer(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int m=Integer.parseInt(sc.nextLine());
        List<Product> products=new ArrayList<>();
        for(int i=0;i<m;i++){
            products.add(new Product(i,sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        int o=Integer.parseInt(sc.nextLine());
        List<Invoice> invoices=new ArrayList<>();
        for(int i=0;i<o;i++){
            invoices.add(new Invoice(i,sc.nextLine()));
        }
        for(Invoice iv : invoices){
            for(Customer c : customers){
                if(iv.getCusId().equals(c.getCusId())){
                    iv.setCustomer(c);
                }
            }
        }
        for(Invoice iv : invoices){
            for(Product p : products){
                if(iv.getProId().equals(p.getProId())){
                    iv.setProduct(p);
                }
            }
        }
        Collections.sort(invoices);
        invoices.forEach(System.out::println);
    }
}
