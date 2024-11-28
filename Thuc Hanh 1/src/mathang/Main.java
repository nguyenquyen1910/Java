package mathang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<HoaDon> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String phone = sc.nextLine();
            String day = sc.nextLine();
            int m=Integer.parseInt(sc.nextLine());
            List<MatHang> matHangList = new ArrayList<>();
            for(int j=0;j<m;j++){
                matHangList.add(new MatHang(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
            }
            list.add(new HoaDon(i,name,phone,day,matHangList));
        }
        String year = sc.nextLine();
        List<HoaDon> listRes = new ArrayList<>();
        for(HoaDon it : list){
            if(it.getDay().substring(6).equals(year)){
                listRes.add(it);
            }
        }
        if(listRes.size()==0){
            System.out.println("khong co don hang");
        }
        else{
            for(HoaDon it : listRes){
                System.out.println(it);
            }
        }
    }
}
/*
2
To an an
0945338955
02/03/2022
1
sua
10
200
Lai Bac
0912447845
05/11/2023
1
tat
5
10
 */