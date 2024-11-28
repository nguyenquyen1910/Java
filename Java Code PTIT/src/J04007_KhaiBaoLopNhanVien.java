import java.util.Scanner;

public class J04007_KhaiBaoLopNhanVien {
    private String id;
    private String name;
    private String gender;
    private String date;
    private String place;
    private String sdt;
    private String day;

    public J04007_KhaiBaoLopNhanVien(String id,String date, String day, String gender, String name, String place, String sdt) {
        this.date = date;
        this.day = day;
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.place = place;
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return this.id+" "+this.name+" "+this.gender+" "+this.date+" "+this.place+" "+this.sdt+" "+this.day;
    }

    public static String dateMake(String s){
        StringBuilder str=new StringBuilder(s);
        if(str.charAt(1)=='/'){
            str.insert(0,"0");
        }
        if(str.charAt(4)=='/'){
            str.insert(3,"0");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        String gender=sc.nextLine();
        String date=sc.nextLine();
        String place=sc.nextLine();
        String sdt=sc.nextLine();
        String day=sc.nextLine();
        J04007_KhaiBaoLopNhanVien nv=new J04007_KhaiBaoLopNhanVien("00001",dateMake(date),dateMake(day),gender,name,place,sdt);
        System.out.println(nv.toString());
    }
}
