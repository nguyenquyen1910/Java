package sapxeplichthi;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Subject> subjects = new ArrayList<>();
        for(int i=0;i<n;i++){
            subjects.add(new Subject(sc.nextLine().trim(), sc.nextLine(), sc.nextLine()));
        }

        Scanner sc1 = new Scanner(new File("CATHI.in"));
        int m = Integer.parseInt(sc1.nextLine());
        List<Session> sessions = new ArrayList<>();
        for(int i=0;i<m;i++){
            sessions.add(new Session(i, sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }

        Scanner sc2 = new Scanner(new File("LICHTHI.in"));
        int o = Integer.parseInt(sc2.nextLine());
        List<Schedule> schedules = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] tmp = sc2.nextLine().trim().split(" ", 4);
            schedules.add(new Schedule(tmp[0], tmp[1], tmp[2], Integer.parseInt(tmp[3])));
        }

        for(Schedule schedule : schedules){
            for(Subject subject : subjects){
                if(schedule.getSubId().equals(subject.getSubId())){
                    schedule.setSubject(subject);
                    break;
                }
            }
        }

        for(Schedule schedule : schedules){
            for(Session session : sessions){
                if(schedule.getSesId().equals(session.getSesId())){
                    schedule.setSession(session);
                    break;
                }
            }
        }

        Collections.sort(schedules);
        schedules.forEach(System.out::println);
    }
}
