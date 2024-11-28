package J05043_tinhthunhapnhanvien;

public class Staff {
    private String id;
    private String name;
    private String role;
    private Long daySalary;
    private Integer dayOfWork;
    private Long totalSalary;
    private Long roleBonus;
    private Long advanceSalary;

    public Staff(int i, String name, String role, Long daySalary, Integer dayOfWork) {
        this.id = "NV" + String.format("%02d", i + 1);
        this.name = name;
        this.role = role;
        this.daySalary = daySalary;
        this.dayOfWork = dayOfWork;
        this.roleBonus = solveRoleBonus();
        this.totalSalary = solveTotalSalary();
        this.advanceSalary = solveAdvanceSalary();
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

    private Long solveTotalSalary(){
        return daySalary * dayOfWork;
    }

    private Long solveAdvanceSalary(){
        long advance = (totalSalary + roleBonus) * 2 / 3;
        if (advance < 25000) {
            return Math.round((double) advance / 1000) * 1000L;
        }
        return 25000L;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+roleBonus+" "+totalSalary+" "+advanceSalary+" "+(totalSalary+roleBonus-advanceSalary);
    }
}
