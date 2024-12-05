package J04012_baitoantinhcong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee(sc.nextLine().trim(), Long.parseLong(sc.nextLine().trim()), Long.parseLong(sc.nextLine().trim()), sc.nextLine().trim());
        System.out.println(employee);
    }
}
