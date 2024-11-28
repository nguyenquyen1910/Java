package thoigianonlinelientuc;

import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Student implements Comparable<Student> {
    private String name;
    private Date timeStart;
    private Date timeEnd;
    private long timeUsed;

    public Student(String name, Date timeStart, Date timeEnd) {
        this.name = name;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeUsed = ChronoUnit.MINUTES.between(this.timeStart.toInstant(), this.timeEnd.toInstant());
    }

    @Override
    public String toString() {
        return name+" "+timeUsed;
    }


    @Override
    public int compareTo(Student o) {
        if(this.timeUsed != o.timeUsed){
            return (int) (o.timeUsed-this.timeUsed);
        }
        return this.name.compareTo(o.name);
    }
}
