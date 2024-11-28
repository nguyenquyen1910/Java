import java.util.Scanner;

public class test {
    public static void DoiChoTrucTiep(int n,int []arr) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            System.out.println("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {

                System.out.print(arr[j]);
                if (j < n - 1) {
                    System.out.println(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        DoiChoTrucTiep(n,arr);
    }
}
