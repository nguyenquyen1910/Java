// Ki tu ke tiep

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        char tmp = Character.toLowerCase(x);
        if(tmp=='z') System.out.println('a');
        else
            System.out.printf("%c", tmp+1);
    }
}
