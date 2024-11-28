package J06002_sapxephoadonbanquanao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Product> listProduct=new ArrayList<>();
        for(int i=0;i<n;i++){
            listProduct.add(new Product(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        int m=Integer.parseInt(sc.nextLine());
        List<Invoice> listInvoice=new ArrayList<>();
        for(int i=0;i<m;i++){
            listInvoice.add(new Invoice(i,sc.nextLine()));
        }
        for(Invoice iv : listInvoice){
            for(Product pr : listProduct){
                if(iv.getProductId().substring(0,2).equals(pr.getId())){
                    iv.setProduct(pr);
                    break;
                }
            }
        }
        Collections.sort(listInvoice);
        for(Invoice iv : listInvoice){
            System.out.println(iv.toString());
        }
    }
}
