import java.util.Scanner;

public class LatNguocXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int test=0;test<n;test++){
            String[] tmp=sc.nextLine().trim().split("\\s+");
            for(int i= tmp.length-1;i>=0;i--){
                System.out.print(tmp[i]+" ");
            }
            System.out.println();
        }
    }
}
