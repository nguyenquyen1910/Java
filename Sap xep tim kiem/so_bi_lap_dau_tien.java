import java.util.Scanner;

public class so_bi_lap_dau_tien {
    public static int[] mark=new int[10000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            mark[a[i]]++;
        }
        for(int i=0;i<n;i++){
            if(mark[a[i]]>1){
                System.out.println(a[i]);
                return;
            }
        }
        System.out.println("NO NUMBER");
    }
}
