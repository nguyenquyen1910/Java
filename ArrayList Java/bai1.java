import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.*;
/**
 * bai1
 */
public class bai1 {

    public static void main(String[] args) {
        // Chi ArrayList moi ho tro sap xep operator
        // Con int[] thi khong
        /*ArrayList<Integer> arr=new ArrayList<>();
        arr.add(19);
        arr.add(10);
        arr.add(2004);
        System.out.println(arr.size());
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
        Collections.sort(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
        if(Collections.binarySearch(arr,19)>=0) System.out.println("YES");
        else System.out.println("NO");*/
        //Xay dung comparator cho Array.sort()
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] a=new Integer[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,Integer o2){
                String s1=o1+"";
                String s2=o2+"";
                if(s1.length()!=s2.length()) return s1.length()-s2.length();
                else return o2-o1;
            }
        });
        for(int x : a){
            System.out.print(x+" ");
        }
    }
}