import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.*;
//Sap xep theo tong chu so tang dan
//Neu 2 so co cung tong, so nao xuat hien truoc thi in ra truoc
//Tim sort = Insertion sort + Merge sort: Java, Python(stable) luon giu vi tri ban dau xuat hien
public class sap_xep_operator {
    public static int sumNum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,Integer o2){
                return sumNum(o1)-sumNum(o2);
            }
        });
        for(int x : a){
            System.out.print(x+" ");
        }
    }
}
