package danhsachsinhvien2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student {
    private String id, name, classname, dateOfBirth;
    private double gpa;

    public Student(int i, String name, String classname, String dateOfBirth, double gpa) throws ParseException {
        this.id = "B20DCCN"+String.format("%03d", i+1);
        this.name = name;
        this.classname = classname;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.dateOfBirth = sdf.format(sdf.parse(dateOfBirth));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+classname+" "+dateOfBirth+" "+String.format("%.2f", gpa);
    }
}
