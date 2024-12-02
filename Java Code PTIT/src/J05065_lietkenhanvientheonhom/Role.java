package J05065_lietkenhanvientheonhom;

import java.util.ArrayList;
import java.util.List;

public class Role {
    private String roleId;
    private List<Employee> employees;

    public Role(String roleId){
        this.roleId = roleId;
        this.employees = new ArrayList<>();
    }

    public String getRoleId() {
        return roleId;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
