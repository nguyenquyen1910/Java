package matrixfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int idx=sc.nextInt();
            idx-=1;
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n*m;i++){
                list.add(sc.nextInt());
            }
            Matrix matrix = new Matrix(list,n,m,idx);
            matrix.sortColumn();
            System.out.println(matrix);
        }
    }
}
