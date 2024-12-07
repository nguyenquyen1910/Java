import java.util.Scanner;

public class LatNguocXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            for(int j=s.length-1;j>=0;j--){
                System.out.print(s[j]+" ");
            }
            System.out.println();
        }
    }
}
