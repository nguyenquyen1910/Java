import java.util.Scanner;

public class gui_thu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i==0){
                System.out.println((a[1]-a[0])+" "+(a[n-1]-a[0]));
            }
            else if(i==n-1){
                System.out.println((a[n-1]-a[n-2])+" "+(a[n-1]-a[0]));
            }
            else{
                System.out.println((Math.min((a[i]-a[i-1]),(a[i+1]-a[i])))+" "+(Math.max((a[i]-a[0]), (a[n-1]-a[i]))));
            }
        }
    }
}
