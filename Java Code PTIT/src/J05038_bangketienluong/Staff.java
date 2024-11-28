package J05038_bangketienluong;

public class Staff implements Comparable<Staff>{
    private String id;
    private String name;
    private Long daySalary;
    private Integer dayOfWork;
    private Long monthSalary;
    private String role;
    private Long bonus;
    private Long roleBonus;
    private Long totalSalary;

    public Staff(int i, String name, Long daySalary, Integer dayOfWork, String role) {
        this.id = "NV"+String.format("%02d",i+1);
        this.name = name;
        this.daySalary = daySalary;
        this.dayOfWork = dayOfWork;
        this.role = role;
        this.monthSalary = daySalary * dayOfWork;
        this.bonus = solveBonus();
        this.roleBonus = solveRoleBonus();
        this.totalSalary = solveTotalSalary();
    }

    private Long solveBonus(){
        if(dayOfWork >= 25){
            return Math.round(monthSalary * 0.2);
        }
        if(dayOfWork >= 22){
            return Math.round(monthSalary * 0.1);
        }
        return 0L;
    }

    private Long solveRoleBonus(){
        if(role.equals("GD")){
            return 250000L;
        }
        if(role.equals("PGD")){
            return 200000L;
        }
        if(role.equals("TP")){
            return 180000L;
        }
        return 150000L;
    }

    private Long solveTotalSalary(){
        return monthSalary + bonus + roleBonus;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+monthSalary+" "+bonus+" "+roleBonus+" "+totalSalary;
    }

    @Override
    public int compareTo(Staff o) {
        return o.totalSalary.compareTo(this.totalSalary);
    }
}
