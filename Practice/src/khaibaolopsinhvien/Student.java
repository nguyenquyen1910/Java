package khaibaolopsinhvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student {
    private String id, name, classname, date;
    private double gpa;

    public Student(int i, String name, String classname, String date, double gpa) throws ParseException {
        this.id = "B20DCCN"+String.format("%03d", i+1);
        this.name = name;
        this.classname = classname;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.date = sdf.format(sdf.parse(date));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+classname+" "+date+" "+String.format("%.2f",gpa);
    }
}
