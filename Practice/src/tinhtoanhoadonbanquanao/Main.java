package tinhtoanhoadonbanquanao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Product> products = new ArrayList<>();
        for(int i=0;i<n;i++){
            products.add(new Product(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));
        }
        int m=Integer.parseInt(sc.nextLine());
        List<Invoice> invoices = new ArrayList<>();
        for(int i=0;i<m;i++){
            String info = sc.nextLine();
            invoices.add(new Invoice(i,info.substring(0,3),Integer.parseInt(info.substring(4))));
        }
        for(Invoice invoice : invoices){
            for(Product product : products){
                if(invoice.getProId().substring(0,2).equals(product.getProId())){
                    invoice.setProduct(product);
                }
            }
        }
        for(Invoice invoice : invoices){
            System.out.println(invoice);
        }
    }
}
