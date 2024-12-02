package J05065_lietkenhanvientheonhom;

public class Employee implements Comparable<Employee> {
    private String emId;
    private String emName;
    private String roleId;
    private String factor;
    private String emNumber;

    public Employee(String emId, String emName) {
        this.emId = emId;
        this.emName = emName;
        this.roleId = emId.substring(0,2);
        this.factor = emId.substring(2,4);
        this.emNumber = emId.substring(4);
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getEmName() {
        return emName;
    }

    @Override
    public String toString() {
        return emName+" "+roleId+" "+emNumber+" "+factor;
    }

    @Override
    public int compareTo(Employee o) {
        int factorComparison = Integer.compare(Integer.parseInt(o.factor), Integer.parseInt(this.factor));
        if (factorComparison != 0) {
            return factorComparison;
        }
        return Integer.compare(Integer.parseInt(this.emNumber), Integer.parseInt(o.emNumber));
    }
}
