import java.util.Scanner;

public class J02012_SapXepChen {
    public static void insertionSort(int a[],int n){
        System.out.println("Buoc 0: "+a[0]);
        for(int i=1;i<n;i++){
            int tmp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>tmp){
                a[j+1]=a[j];
                --j;
            }
            a[j+1]=tmp;
            System.out.print("Buoc "+i+": ");
            for(int k=0;k<=i;k++){
                System.out.print(a[k]+" ");
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
        insertionSort(a,n);
    }
}
