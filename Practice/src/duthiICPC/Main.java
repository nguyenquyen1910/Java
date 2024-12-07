package duthiICPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<School> schools = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] info = sc.nextLine().trim().split(" ", 2);
            schools.add(new School(info[0], info[1]));
        }

        Scanner sc1 = new Scanner(new File("REGISTER.in"));
        int m = Integer.parseInt(sc1.nextLine());
        List<Register> registers = new ArrayList<>();
        for(int i=0;i<m;i++){
            String[] info = sc1.nextLine().trim().split(" ", 2);
            String schoolId = info[0];
            int teamQuantity = Integer.parseInt(info[1]);
            for(int j=0;j<teamQuantity;j++){
                String teamName = sc1.nextLine().trim();
                registers.add(new Register(schoolId, teamName));
            }
        }

        for(Register register : registers){
            for(School school : schools){
                if(register.getSchoolId().equals(school.getId())){
                    register.setSchool(school);
                    break;
                }
            }
        }

        Collections.sort(registers);
        for(int i=0;i<registers.size();i++){
            registers.get(i).setTeamId("team"+String.format("%02d",i+1));
        }

        registers.forEach(System.out::println);
    }
}