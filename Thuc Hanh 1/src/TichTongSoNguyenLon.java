import java.util.Scanner;

public class TichTongSoNguyenLon {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        String n=sc.nextLine();
        long mul=1;
        long sum=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)!='0'){
                if(i%2==0){
                    mul*=Integer.parseInt(n.charAt(i)+"");
                }
                else{
                    sum+=Integer.parseInt(n.charAt(i)+"");
                }
            }
        }
        System.out.println(mul+" "+sum);

    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            testCase();
        }
    }
}
