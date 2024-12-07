package thoigianonlinelientuc;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student implements Comparable<Student> {
    private String name, timeStart, timeEnd;
    private long timeUsed;

    public Student(String name, String timeStart, String timeEnd) throws ParseException {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.timeStart = sdf.format(sdf.parse(timeStart));
        this.timeEnd = sdf.format(sdf.parse(timeEnd));
        this.timeUsed = (sdf.parse(timeEnd).getTime() - sdf.parse(timeStart).getTime()) / (1000*60);
    }

    @Override
    public String toString() {
        return name+" "+timeUsed;
    }

    @Override
    public int compareTo(Student o) {
        if(this.timeUsed != o.timeUsed){
            return Long.compare(o.timeUsed, this.timeUsed);
        }
        return this.name.compareTo(o.name);
    }
}
