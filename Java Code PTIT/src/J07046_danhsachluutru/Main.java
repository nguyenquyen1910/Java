package J07046_danhsachluutru;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new KhachHang(i,sc.nextLine(),sc.nextLine(),sdf.parse(sc.nextLine()),sdf.parse(sc.nextLine())));
        }
        Collections.sort(list);
        for(KhachHang it : list){
            System.out.println(it);
        }
    }
}
