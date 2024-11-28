package J05018_bangdiemhocsinh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Student> list =new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            float[] p=new float[10];
            for(int j=0;j<10;j++){
                p[j]=sc.nextFloat();
            }
            sc.nextLine();
            list.add(new Student(i, name, p));
        }
        Collections.sort(list);
        for(Student it : list){
            System.out.println(it.toString());
        }
    }
}
