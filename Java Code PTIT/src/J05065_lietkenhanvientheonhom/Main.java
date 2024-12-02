package J05065_lietkenhanvientheonhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Role> roles = new ArrayList<>();
        int cntGD=0, cntTP=0, cntPP=0;
        for(int i=0;i<n;i++){
            String info = sc.nextLine().trim();
            String emId = info.substring(0,7);
            String emName = info.substring(8);

            Employee employee = new Employee(emId,emName);
            String roleId = employee.getRoleId();
            if(roleId.equals("GD") && cntGD>=1){
                employee.setRoleId("NV");
            }
            else if(roleId.equals("TP") && cntTP>=3){
                employee.setRoleId("NV");
            }
            else if(roleId.equals("PP") && cntPP>=3){
                employee.setRoleId("NV");
            }

            if (employee.getRoleId().equals("GD")) {
                cntGD++;
            } else if (employee.getRoleId().equals("TP")) {
                cntTP++;
            } else if (employee.getRoleId().equals("PP")) {
                cntPP++;
            }

            boolean found = false;
            for (Role role : roles) {
                if (role.getRoleId().equals(employee.getRoleId())) {
                    role.getEmployees().add(employee);
                    found = true;
                    break;
                }
            }
            if (!found) {
                Role role = new Role(employee.getRoleId());
                role.getEmployees().add(employee);
                roles.add(role);
            }
            roles.forEach(e -> {
                Collections.sort(e.getEmployees());
            });
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String query = sc.nextLine().toLowerCase();
            List<Employee> employees = new ArrayList<>();
            for (Role role : roles) {
                for (Employee employee : role.getEmployees()) {
                    if (employee.getEmName().toLowerCase().contains(query)) {
                        employees.add(employee);
                    }
                }
            }
            Collections.sort(employees);
            employees.forEach(System.out::println);
            System.out.println();
        }

    }
}
