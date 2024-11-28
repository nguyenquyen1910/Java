// Doi ngay sang nam thang ngay

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date=sc.nextInt();
        int year=date/365;
        int month=(date%365)/7;
        int day=date-year*365-month*7;
        System.out.println(year + " " + month + " " + day);
    }
}
