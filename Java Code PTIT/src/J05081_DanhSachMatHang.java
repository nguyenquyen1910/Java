import java.util.*;

class Product implements Comparable<Product>{
    private String id,name,dvt;
    private int priceBuy,priceSell,profit;

    public Product(int i,String dvt, String name, int priceBuy, int priceSell) {
        this.dvt = dvt;
        this.id="MH"+String.format("%03d", i+1);
        this.name = name;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
        this.profit=this.priceSell-this.priceBuy;
    }

    public int getProfit() {
        return profit;
    }
    @Override
    public String toString() {
        return id+" "+name+" "+dvt+" "+priceBuy+" "+priceSell+" "+this.profit;
    }
    @Override
    public int compareTo(Product o) {
        return o.getProfit()-this.profit;
    }
}

public class J05081_DanhSachMatHang {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Product> a=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            String name=sc.nextLine();
            String dvt=sc.nextLine();
            int priceBuy=Integer.parseInt(sc.nextLine());
            int priceSell=Integer.parseInt(sc.nextLine());
            a.add(new Product(i,dvt,name,priceBuy,priceSell));
        }
        Collections.sort(a);
        for(Product i : a){
            System.out.println(i);
        }
    }
}
