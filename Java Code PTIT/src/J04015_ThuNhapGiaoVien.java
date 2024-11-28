import java.util.Scanner;

public class J04015_ThuNhapGiaoVien {
    private String id;
    private String name;
    private int salary;
    private String role;
    private int thunhap;

    public J04015_ThuNhapGiaoVien(String id, String name, String role, int salary, int thunhap) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.thunhap = thunhap;
    }
    public int getBacLuong(){
        int tmp=(this.id.charAt(2)-'0')*10+(this.id.charAt(3)-'0');
        return tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id=sc.nextLine();
        String name=sc.nextLine();
        int salary=sc.nextInt();
        int troCap=0;
        if(id.charAt(1)=='P'){
            troCap=900000;
        }
        else if(id.charAt(2)=='T'){
            troCap=2000000;
        }
        else troCap=500000;
    }
}
