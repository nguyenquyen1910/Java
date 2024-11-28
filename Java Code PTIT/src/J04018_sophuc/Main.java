package J04018_sophuc;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        int x=sc.nextInt();
        int y=sc.nextInt();
        SoPhuc s1=new SoPhuc(x,y);
        x=sc.nextInt();
        y=sc.nextInt();
        SoPhuc s2=new SoPhuc(x,y);
        SoPhuc sum=SoPhuc.sumNum(s1,s2);
        SoPhuc mul=SoPhuc.mulNum(s1,s2);
        SoPhuc res1=SoPhuc.mulNum(sum,s1);
        SoPhuc res2=SoPhuc.mulNum(sum,sum);
        System.out.println(res1.toString()+", "+res2.toString());
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            testCase();
        }
    }
}
