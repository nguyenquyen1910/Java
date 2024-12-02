package J07020_hoadon2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Customer> customers = new ArrayList<>();
        for(int i=0;i<n;i++){
            customers.add(new Customer(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Scanner sc1 = new Scanner(new File("MH.in"));
        int m = Integer.parseInt(sc1.nextLine());
        List<Product> products = new ArrayList<>();
        for(int i=0;i<m;i++){
            products.add(new Product(i, sc1.nextLine(), sc1.nextLine(), Long.parseLong(sc1.nextLine()), Long.parseLong(sc1.nextLine())));
        }
        Scanner sc2 = new Scanner(new File("HD.in"));
        int o = Integer.parseInt(sc2.nextLine());
        List<Invoice> invoices = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] tmp = sc2.nextLine().trim().split(" ", 3);
            invoices.add(new Invoice(i, tmp[0], tmp[1], Integer.parseInt(tmp[2])));
        }

        for(Invoice invoice : invoices){
            for(Customer customer : customers){
                if(invoice.getCusId().equals(customer.getCusId())){
                    invoice.setCustomer(customer);
                    break;
                }
            }
        }

        for(Invoice invoice : invoices){
            for(Product product : products){
                if(invoice.getProId().equals(product.getProductId())){
                    invoice.setProduct(product);
                    break;
                }
            }
        }

        invoices.forEach(System.out::println);
    }
}
