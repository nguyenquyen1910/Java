package J05055_xephangvdv1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Athlete> athletes = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        for(int i=0;i<n;i++){
            athletes.add(new Athlete(i, sc.nextLine(),sdf.parse(sc.nextLine()),sdf2.parse(sc.nextLine()),sdf2.parse(sc.nextLine())));
        }
        List<Athlete> sortedAthletes = new ArrayList<>(athletes);
        Collections.sort(sortedAthletes);

        int rank=1;
        for(int i=0;i<n;i++){
            if(i>0 && sortedAthletes.get(i).getRankTime().equals(sortedAthletes.get(i-1).getRankTime())){
                sortedAthletes.get(i).setRank(sortedAthletes.get(i-1).getRank());
            }
            else{
                sortedAthletes.get(i).setRank(rank);
            }
            rank++;
        }
        for(Athlete a : sortedAthletes){
            System.out.println(a);
        }
    }
}
