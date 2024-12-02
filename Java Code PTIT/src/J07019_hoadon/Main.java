package J07019_hoadon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Product> products = new ArrayList<>();
        for(int i=0;i<n;i++){
            products.add(new Product(sc.nextLine().trim(), sc.nextLine().trim(), Long.parseLong(sc.nextLine().trim()), Long.parseLong(sc.nextLine().trim())));
        }
        Scanner sc1 = new Scanner(new File("DATA2.in"));
        int m = Integer.parseInt(sc1.nextLine());
        List<Invoice> invoices = new ArrayList<>();
        for(int i=0;i<m;i++){
            String[] tmp = sc1.nextLine().trim().split(" ", 2);
            invoices.add(new Invoice(i, tmp[0].trim(), Integer.parseInt(tmp[1].trim())));
        }

        for(Invoice invoice : invoices){
            for(Product product : products){
                if(invoice.getProductId().substring(0,2).equals(product.getProductId())){
                    invoice.setProduct(product);
                    break;
                }
            }
        }

        invoices.forEach(System.out::println);
    }
}
