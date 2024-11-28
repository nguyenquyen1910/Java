package J05007_sapxepdoituongnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        int n=Integer.parseInt(sc.nextLine());
        List<NhanVien> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new NhanVien(i,sc.nextLine(),sc.nextLine(), sdf.parse(sc.nextLine()),sc.nextLine(),sc.nextLine(),sdf.parse(sc.nextLine())));
        }
        Collections.sort(a);
        for(NhanVien nv:a){
            System.out.println(nv.toString());
        }
    }
}
