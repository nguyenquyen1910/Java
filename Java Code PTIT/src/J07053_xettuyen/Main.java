package J07053_xettuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String solveName(String s){
        s=s.toLowerCase();
        String res="";
        String[] tmp = s.split("\\s+");
        for(String x : tmp){
            x=x.substring(0,1).toUpperCase()+x.toLowerCase().substring(1);
            res+=x+" ";
        }
        return res.trim();
    }
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ThiSinh(i,solveName(sc.nextLine().trim()),sdf.parse(sc.nextLine()), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        for(ThiSinh it : list){
            System.out.println(it);
        }
    }
}
