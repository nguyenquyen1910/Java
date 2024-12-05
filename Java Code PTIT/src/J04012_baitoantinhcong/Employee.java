package J04012_baitoantinhcong;

public class Employee {
    private String id, name;
    private long baseSalary, workday;
    private String role;
    private long salary, bonus, roleBonus, totalSalary;

    public Employee(String name, long baseSalary, long workday, String role) {
        this.id = "NV01";
        this.name = name;
        this.baseSalary = baseSalary;
        this.workday = workday;
        this.role = role;
        this.salary = baseSalary * workday;
        this.bonus = solveBonus();
        this.roleBonus = solveRoleBonus();
        this.totalSalary = this.salary + this.bonus + this.roleBonus;
    }

    private long solveBonus() {
        if(workday>=25){
            return (long) (salary*0.2);
        }
        if(workday>=22){
            return (long) (salary*0.1);
        }
        return 0;
    }

    private long solveRoleBonus() {
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

    @Override
    public String toString() {
        return id+" "+name+" "+salary+" "+bonus+" "+roleBonus+" "+totalSalary;
    }
}
