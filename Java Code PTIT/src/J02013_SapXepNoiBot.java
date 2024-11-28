import java.util.Scanner;

public class J02013_SapXepNoiBot {
    public static void bubbleSort(int a[],int n){
        int m=1;
        for(int i=0;i<n;i++){
            boolean check=true;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                    check=false;
                }
            }
            if(check) break;
            System.out.print("Buoc "+(m++)+": ");
            for(int j=0;j<n;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        bubbleSort(a,n);
    }
}
