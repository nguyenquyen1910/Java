import java.util.Scanner;

public class die_hard {
    public static boolean check(int a[],int n){
        int cnt25=0,cnt50=0;
        for(int i=0;i<n;i++){
            if(a[i]==25) cnt25++;
            else if(a[i]==50){
                if(cnt25==0) return false;
                --cnt25;
                ++cnt50;
            }
            else{
                if(cnt25==0 || cnt25*25+cnt50*50<75) return false;
                if(cnt50!=0){
                    --cnt50;
                    --cnt25;
                }
                else{
                    cnt25-=3;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        if(check(a, n)){
            System.out.print("YES");
        }
        else System.out.print("NO");
    }
    
}