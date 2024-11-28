import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sap_xep_cac_tu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] res=s.split("\\s++");
        ArrayList<String> arr=new ArrayList<>();
        for(String x : res){
            arr.add(x);
        }
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println("");

        //Sap xep theo do dai cua tung tu
        Arrays.sort(res,new Comparator<String>() {
            @Override
            public int compare(String o1,String o2){
                int len1=o1.length();
                int len2=o2.length();
                if(len1!=len2){
                    return len1-len2;
                }
                else return o1.compareTo(o2);
            }
        });
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
