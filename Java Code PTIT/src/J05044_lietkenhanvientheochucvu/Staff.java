package J05044_lietkenhanvientheochucvu;

public class Staff {
    private String id;
    private String name;
    private String role;
    private Long salary;
    private Integer dateOfWork;
    private Long roleBonus;
    private Long totalSalary;
    private Long preSalary;

    public Staff(int i, String name, String role, Long salary, Integer dateOfWork) {
        this.id = "NV"+String.format("%02d", i+1);
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.dateOfWork = dateOfWork;
        this.totalSalary = this.salary * this.dateOfWork;
        this.roleBonus = solveRoleBonus();
        this.preSalary = solvePreSalary();
    }

    public String getRole() {
        return role;
    }

    private Long solveRoleBonus() {
        switch (role) {
            case "GD":
                return 500L;
            case "PGD":
                return 400L;
            case "TP":
                return 300L;
            case "KT":
                return 250L;
            default:
                return 100L;
        }
    }

    private Long solvePreSalary() {
        long pre = (totalSalary + roleBonus) * 2/3;
        if(pre < 25000){
            return Math.round((double) pre / 1000) * 1000L;
        }
        return 25000L;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+roleBonus+" "+totalSalary+" "+preSalary+" "+(totalSalary+roleBonus-preSalary);
    }
}
