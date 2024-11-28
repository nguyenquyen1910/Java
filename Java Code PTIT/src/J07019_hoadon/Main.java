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
            products.add(new Product(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Scanner sc1 = new Scanner(new File("DATA2.in"));
        int m = Integer.parseInt(sc1.nextLine());
        List<Invoice> invoices = new ArrayList<>();
        for(int i=0;i<m;i++){
            String[] tmp = sc1.nextLine().split("\\s+");
            String invoidId = tmp[0];
            int quantity = Integer.parseInt(tmp[1]);
            invoices.add(new Invoice(i,invoidId,quantity));
        }

        for(Invoice invoice : invoices){
            for(Product product : products){
                if(invoice.getInvoiceId().substring(0,2).equals(product.getProductId())){
                    invoice.setProduct(product);
                }
            }
        }

        for(Invoice invoice : invoices){
            System.out.println(invoice);
        }
    }
}
