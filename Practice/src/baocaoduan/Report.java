package baocaoduan;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Report implements Comparable<Report> {
    private String stuId, time;
    private Exercise exercise;
    private long times;
    public Report(String stuId, String time) throws ParseException {
        this.stuId = stuId;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        this.time = sdf.format(sdf.parse(time));
        this.times = sdf.parse(this.time).getTime();
    }

    public String getStuId() {
        return stuId;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return stuId+" "+exercise.getStuName()+" "+exercise.getExeName()+" "+time;
    }

    @Override
    public int compareTo(Report o) {
        return Long.compare(this.times, o.times);
    }
}
