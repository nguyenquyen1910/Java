//Neu co nhieu day con co cung do dai, in ra day con co tong lon nhat
import java.util.Scanner;

public class day_con_dai_nhat_khac_nhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int pos1=0,pos2=0;
        long res=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            long sum=a[i-1];
            int l=i-1,r=i-1;
            if(a[i]!=a[i-1]){
                while(i<n && a[i]!=a[i-1]){
                    sum+=a[i];
                    ++i;
                    ++r;
                }
            }
            if(pos2-pos1<r-l){
                pos2=r;
                pos1=l;
            }
            else if(pos2-pos1==r-l && res<sum){
                res=sum;
                pos2=r;
                pos1=l;
            }
        }
        System.out.println(pos2-pos1+1);
        for(int i=pos1;i<=pos2;i++){
            System.out.print(a[i]+" ");
        }
    }
}
