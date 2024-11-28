import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SinhVien {
    private String id;
    private String name;
    private String lop;
    private String date;
    private double gpa;
    
    public String dateRemake(String s){
        StringBuilder str=new StringBuilder(s);
        if(str.charAt(1)=='/') str.insert(0, "0");
        if(str.charAt(4)=='/') str.insert(3, "0");
        return str.toString();
    }
    public SinhVien(int i,String name,String lop,String date,double gpa){
        String ma="";
        if(i<10) ma+="SV00"+(i+1);
        else ma+="SV0"+(i+1);
        this.id=ma;
        this.name=name;
        this.lop=lop;
        this.date = dateRemake(date);
        this.gpa=gpa;
    }
    public String getName() {
        return name;
    }
    public String getLop() {
        return lop;
    }
    public String getDate() {
        return date;
    }
    public double getGpa() {
        return gpa;
    }
    public String toString() {
        return this.id+" "+this.name+" "+this.lop+" "+this.date+" "+String.format("%.2f", this.gpa);
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        SinhVien[] ds=new SinhVien[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            String name=sc.nextLine(),lop=sc.nextLine(),date=sc.nextLine();
            double gpa=sc.nextDouble();
            ds[i]=new SinhVien(i,name, lop, date, gpa);
        }
        Arrays.sort(ds,new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.getGpa(), o2.getGpa());
            }
        });
        for(SinhVien x : ds){
            System.out.println(x.toString());
        }
    }
}
