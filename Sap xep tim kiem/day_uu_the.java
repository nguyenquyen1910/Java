import java.util.Scanner;

public class day_uu_the {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0,chan=0,le=0;
        while(sc.hasNext()){
            int x=sc.nextInt();
            ++cnt;
            if(x%2==0) chan++;
            else le++;
        }
        if((cnt%2==0 && chan>le) ||(cnt%2==1 && le>chan)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }    
}
