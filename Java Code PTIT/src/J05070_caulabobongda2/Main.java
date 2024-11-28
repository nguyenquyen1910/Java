package J05070_caulabobongda2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<FootballClub> listClub=new ArrayList<>();
        for(int i=0;i<n;i++){
            listClub.add(new FootballClub(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        int m=Integer.parseInt(sc.nextLine());
        List<MatchFootball> listMatch=new ArrayList<>();
        for(int i=0;i<m;i++){
            String[] info=sc.nextLine().split("\\s+");
            String idMatch=info[0];
            int audis=Integer.parseInt(info[1]);
            FootballClub club=listClub.stream().filter(it -> it.getId().equals(idMatch.substring(1,3))).findFirst().orElse(null);
            if(club!=null){
                listMatch.add(new MatchFootball(idMatch,audis,club));
            }
        }
        Collections.sort(listMatch);
        for(MatchFootball it : listMatch){
            System.out.println(it.toString());
        }
    }
}
