package baocaoduan;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("BAITAP.in"));
        List<Exercise> exercises = new ArrayList<>();
        while(sc.hasNextLine()){
            exercises.add(new Exercise(sc.nextLine().trim(), sc.nextLine(), sc.nextLine()));
        }

        Scanner sc1 = new Scanner(new File("BAOCAO.in"));
        List<Report> reports = new ArrayList<>();
        while (sc1.hasNextLine()){
            reports.add(new Report(sc1.nextLine().trim(), sc1.nextLine()));
        }

        for(Report report : reports){
            for(Exercise exercise : exercises){
                if(report.getStuId().equals(exercise.getStuId())){
                    report.setExercise(exercise);
                    break;
                }
            }
        }

        List<Report> reportListMorning = new ArrayList<>();
        List<Report> reportListAfternoon = new ArrayList<>();
        reports.forEach(e -> {
            LocalTime localTime = LocalTime.parse(e.getTime());
            if(localTime.isBefore(LocalTime.NOON)){
                reportListMorning.add(e);
            }
            else{
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
                try {
                    e.setTime(sdf.format(sdf.parse(e.getTime())));
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
                reportListAfternoon.add(e);
            }
        });
        Collections.sort(reportListMorning);
        Collections.sort(reportListAfternoon);
        System.out.println("DANH SACH SINH VIEN BAO CAO CA SANG: "+reportListMorning.size());
        reportListMorning.forEach(System.out::println);
        System.out.println();
        System.out.println("DANH SACH SINH VIEN BAO CAO CA CHIEU: "+reportListAfternoon.size());
        reportListAfternoon.forEach(System.out::println);
    }
}