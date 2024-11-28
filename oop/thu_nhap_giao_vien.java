import java.util.Scanner;

public class thu_nhap_giao_vien {
    private String id;
    private String name;
    private int salary;
    private long income;
    private String chucVu;
    private int bacLuong;
    private int phuCap;
    public thu_nhap_giao_vien(String id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.chucVu=id.substring(0,2);
        this.bacLuong=Integer.parseInt(id.substring(2));
        int tmp=0;
        if(id.substring(0,2).equals("HT")){
            tmp=2000000;
        }
        if(id.substring(0,2).equals("HP")){
            tmp=900000;
        }
        if(id.substring(0,2).equals("GV")){
            tmp=500000;
        }
        this.phuCap=tmp;
        this.income=this.salary*this.bacLuong+this.phuCap;
    }
    public String toString() {
        return this.id+" "+this.name+" "+this.bacLuong+" "+this.income;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id=sc.nextLine();
        String name=sc.nextLine();
        int salary=sc.nextInt();
        thu_nhap_giao_vien x=new thu_nhap_giao_vien(id,name,salary);
        System.out.println(x.toString());
    }
}
