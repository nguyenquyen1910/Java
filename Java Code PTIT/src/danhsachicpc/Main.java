package danhsachicpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Team> teams=new ArrayList<>();
        for(int i=0;i<n;i++){
            teams.add(new Team(i,sc.nextLine(),sc.nextLine()));
        }
        int m=Integer.parseInt(sc.nextLine());
        List<ThiSinh> a=new ArrayList<>();
        for(int i=0;i<m;i++){
            a.add(new ThiSinh(i,sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(a);
        for(ThiSinh x : a){
            for(Team y : teams){
                if(x.getTeam().equals(y.getCnt())){
                    x.setIt(y);
                    System.out.println(x.toString());
                }
            }
        }
    }
}
