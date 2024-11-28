import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class XuLyChuoi {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        String s=sc.nextLine();
        List<Character> list=new ArrayList<Character>();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                sum+=Character.getNumericValue(s.charAt(i));
            }
        }
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        for(Character it : list){
            System.out.print(it);
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            testCase();
            System.out.println();
        }
    }
}
