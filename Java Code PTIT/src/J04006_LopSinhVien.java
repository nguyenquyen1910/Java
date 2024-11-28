import java.util.Scanner;

public class J04006_LopSinhVien {
    private String id;
    private String name;
    private String lop;
    private String date;
    private float gpa;

    public J04006_LopSinhVien(String date, float gpa, String id, String lop, String name) {
        this.date = date;
        this.gpa = gpa;
        this.id = id;
        this.lop = lop;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static String dateRemake(String s){
        StringBuilder str=new StringBuilder(s);
        if(str.charAt(1)=='/') str.insert(0, "0");
        if(str.charAt(4)=='/') str.insert(3, "0");
        return str.toString();
    }
    @Override
    public String toString() {
        return this.id+" "+this.name+" "+this.lop+" "+this.date+" "+String.format("%.2f",this.gpa);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String id="B20DCCN001";
        String name=sc.nextLine();
        String lop=sc.nextLine();
        String date=sc.nextLine();
        float gpa=sc.nextFloat();
        J04006_LopSinhVien sv=new J04006_LopSinhVien(dateRemake(date),gpa,id,lop,name);
        System.out.println(sv.toString());
    }
}
