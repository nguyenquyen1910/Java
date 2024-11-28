import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J03010_DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
