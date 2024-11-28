import java.util.Scanner;

public class J02007_DemSoLanXuatHien {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(int test){
        int n=sc.nextInt();
        int[] a=new int[n+1];
        int[] cnt=new int[100005];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            cnt[a[i]]++;
        }
        System.out.println("Test "+test+":");
        for(int i=0;i<n;i++){
            if(cnt[a[i]]!=0){
                System.out.println(a[i] +" xuat hien "+cnt[a[i]]+" lan");
                cnt[a[i]]=0;
            }
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        for(int test=1;test<=t;test++){
            testCase(test);
        }
    }
}
