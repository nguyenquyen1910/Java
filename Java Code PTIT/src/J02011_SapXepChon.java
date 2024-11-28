import java.util.Scanner;

public class J02011_SapXepChon {
    public static Scanner sc = new Scanner(System.in);
    public static void selectionSort(int a[],int n){
        for(int i=0;i<n-1;i++) {
            int min_pos = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_pos]) {
                    min_pos = j;
                }
            }
            int tmp = a[min_pos];
            a[min_pos] = a[i];
            a[i] = tmp;
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=sc.nextInt();
        int a[] = new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        selectionSort(a,n);
    }
}
