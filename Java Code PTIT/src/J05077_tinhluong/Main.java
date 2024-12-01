package J05077_tinhluong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Department> departments = new ArrayList<>();
        for(int i=0;i<n;i++){
            String info = sc.nextLine();
            departments.add(new Department(info.substring(0,2), info.substring(3)));
        }
        int m = Integer.parseInt(sc.nextLine());
        List<Employee> employees = new ArrayList<>();
        for(int i=0;i<m;i++){
            employees.add(new Employee(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for(Employee employee : employees){
            for(Department department : departments){
                if(employee.getEmid().substring(3).equals(department.getId())){
                    employee.setDepartment(department);
                }
            }
        }

        employees.forEach(System.out::println);
    }
}
