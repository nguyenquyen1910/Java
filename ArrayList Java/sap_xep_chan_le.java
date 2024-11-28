import java.util.Vector;
import java.util.Collections;
import java.util.Scanner;

public class sap_xep_chan_le {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Vector<Integer> chan=new Vector<>();
        Vector<Integer> le=new Vector<>();
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                chan.add(a[i]);
            }
            else le.add(a[i]);
        }
        Collections.sort(chan);
        Collections.sort(le);
        for(int i=0;i<le.size();i++){
            System.out.print(le.get(i)+" ");
        }
        for(int i=chan.size()-1;i>=0;i--){
            System.out.print(chan.get(i)+" ");
        }
    }
}
