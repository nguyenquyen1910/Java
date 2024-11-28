package J06005_quanlibanhang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Customer> lisCus=new ArrayList<>();
        for(int i=0;i<n;i++){
            lisCus.add(new Customer(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int m=Integer.parseInt(sc.nextLine());
        List<Product> listPro=new ArrayList<>();
        for(int i=0;i<m;i++){
            listPro.add(new Product(i,sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        int o=Integer.parseInt(sc.nextLine());
        List<Invoice> listInvo=new ArrayList<>();
        for(int i=0;i<o;i++){
            listInvo.add(new Invoice(i,sc.nextLine()));
        }
        for(Invoice iv : listInvo){
            for(Customer c : lisCus){
                if(iv.getCusId().equals(c.getCusId())){
                    iv.setCustomer(c);
                }
            }
        }
        for(Invoice iv : listInvo){
            for(Product p : listPro){
                if(iv.getProId().equals(p.getProId())){
                    iv.setProduct(p);
                }
            }
        }
        Collections.sort(listInvo);
        for(Invoice iv : listInvo){
            System.out.println(iv.toString());
        }
    }
}
