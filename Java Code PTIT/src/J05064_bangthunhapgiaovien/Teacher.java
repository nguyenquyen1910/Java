package J05064_bangthunhapgiaovien;

import java.util.List;

public class Teacher {
    private String id;
    private String name;
    private long salary;
    private long bonusSalary;
    private int factor;
    private long totalSalary;

    public Teacher(String id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonusSalary = solveBonusSalary();
        this.factor = Integer.parseInt(id.substring(2));
        this.totalSalary = salary * this.factor + this.bonusSalary;
    }

    private long solveBonusSalary() {
        if(id.startsWith("HT")){
            return 2000000L;
        }
        if(id.startsWith("HP")){
            return 900000L;
        }
        return 500000L;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+factor+" "+bonusSalary+" "+totalSalary;
    }
}
