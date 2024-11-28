package J05032_trenhatgianhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Person> people = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            people.add(new Person(tmp[0],tmp[1]));
        }
        Collections.sort(people);
        System.out.println(people.get(people.size()-1).getName());
        System.out.println(people.get(0).getName());
    }
}
