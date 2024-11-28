package xoagiangvien;

public class Lecturer {
    private String id;
    private String name;
    private double salaryNum;
    private String bonus;
    private int hour;
    private double bonusNum;
    private double totalSalary;

    public Lecturer(int i, String name, double salaryNum, String bonus, int hour) {
        this.id = "PM"+String.format("%03d", i);
        this.name = name;
        this.salaryNum = salaryNum;
        this.bonus = bonus;
        this.hour = hour;
        this.totalSalary = solveSalary();
    }

    private double solveBonusNum(){
        double res=0;
        if(bonus.equals("A")){
            res=1.5*0.15;
        }
        else if(bonus.equals("B")){
            res=1.2*0.15;
        }
        else if(bonus.equals("C")){
            res=1*0.15;
        }
        return res;
    }

    private double solveSalary(){
        double res=0;
        if(0<=hour && hour<=100){
            res=salaryNum*solveBonusNum()*3000*0.85;
        }
        else if(101<=hour && hour<=350){
            res=salaryNum*solveBonusNum()*3000*0.9;
        }
        else if(351<=hour && hour<=499){
            res=salaryNum*solveBonusNum()*3000*0.95;
        }
        else{
            res=salaryNum*solveBonusNum()*3000;
        }
        return res;
    }

    public String getId() {
        return id;
    }
}
