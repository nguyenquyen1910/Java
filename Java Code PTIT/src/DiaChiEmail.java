import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DiaChiEmail {
    public static void man(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<String> arr=new ArrayList<>();
        while(n-->0){
            String[] tmp=sc.nextLine().trim().toLowerCase().split("\\s+");
            String name=tmp[tmp.length-1];
            for(int i=0;i<tmp.length-1;i++){
                name+=tmp[i].charAt(0);
            }
            arr.add(name);
            int cnt= Collections.frequency(arr,name);
            name+=(cnt==1 ? "" : cnt)+"@ptit.edu.vn";
            System.out.println(name);
        }
    }
}
