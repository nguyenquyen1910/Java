package J05077_tinhluong;

public class Employee {
    private String emid;
    private String emName;
    private long salary;
    private int dateOfWork;
    private int factor;
    private Department department;
    private long totalSalary;

    public Employee(String emid, String emName, long salary, int dateOfWork) {
        this.emid = emid;
        this.emName = emName;
        this.salary = salary;
        this.dateOfWork = dateOfWork;
        this.factor = solveFactor();
        this.totalSalary = salary * dateOfWork * this.factor * 1000;
    }

    private int solveFactor() {
        int factor=0;
        if(emid.startsWith("A")){
            int year = Integer.parseInt(emid.substring(1,3));
            if(1<=year && year<=3){
                factor = 10;
            }
            if(4<=year && year<=8){
                factor = 12;
            }
            if(9<=year && year<=15){
                factor = 14;
            }
            if(16<=year){
                factor = 20;
            }
        }
        else if(emid.startsWith("B")){
            int year = Integer.parseInt(emid.substring(1,3));
            if(1<=year && year<=3){
                factor = 10;
            }
            if(4<=year && year<=8){
                factor = 11;
            }
            if(9<=year && year<=15){
                factor = 13;
            }
            if(16<=year){
                factor = 16;
            }
        }
        else if(emid.startsWith("C")){
            int year = Integer.parseInt(emid.substring(1,3));
            if(1<=year && year<=3){
                factor = 9;
            }
            if(4<=year && year<=8){
                factor = 10;
            }
            if(9<=year && year<=15){
                factor = 12;
            }
            if(16<=year){
                factor = 14;
            }
        }
        else{
            int year = Integer.parseInt(emid.substring(1,3));
            if(1<=year && year<=3){
                factor = 8;
            }
            if(4<=year && year<=8){
                factor = 9;
            }
            if(9<=year && year<=15){
                factor = 11;
            }
            if(16<=year){
                factor = 13;
            }
        }
        return factor;
    }

    public String getEmid() {
        return emid;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return emid+" "+emName+" "+department.getName()+" "+totalSalary;
    }
}
