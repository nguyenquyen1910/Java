package J05078_bangluongtheophongban;

public class NhanVien {
    private String id,name,roleId;
    private int salary,workDate,profit,cnt;

    public NhanVien(String id, String name, int salary, int workDate) {
        this.id = id;
        this.name = name;
        this.roleId=solveRoleId();
        this.salary = salary;
        this.workDate = workDate;
        this.cnt=solveCnt();
        this.profit = salary*workDate*cnt*1000;
    }

    public String solveRoleId(){
        return id.substring(3);
    }

    public int solveCnt(){
        int cnt=0;
        if(id.charAt(0)=='A'){
            if(1<=Integer.parseInt(id.substring(1,3)) && Integer.parseInt(id.substring(1,3))<=3){
                cnt=10;
            }
            else if(4<=Integer.parseInt(id.substring(1,3)) && Integer.parseInt(id.substring(1,3))<=8){
                cnt=12;
            }
            else if(9<=Integer.parseInt(id.substring(1,3)) && Integer.parseInt(id.substring(1,3))<=15){
                cnt=14;
            }
            else{
                cnt=20;
            }
        }
        else if(id.charAt(0)=='B'){
            if(1<=Integer.parseInt(id.substring(1,3)) && Integer.parseInt(id.substring(1,3))<=3){
                cnt=10;
            }
            else if(4<=Integer.parseInt(id.substring(1,3)) && Integer.parseInt(id.substring(1,3))<=8){
                cnt=11;
            }
            else if(9<=Integer.parseInt(id.substring(1,3)) && Integer.parseInt(id.substring(1,3))<=15){
                cnt=13;
            }
            else{
                cnt=16;
            }
        }
        else if(id.charAt(0)=='C'){
            if(1<=Integer.parseInt(id.substring(1,3)) && Integer.parseInt(id.substring(1,3))<=3){
                cnt=9;
            }
            else if(4<=Integer.parseInt(id.substring(1,3)) && Integer.parseInt(id.substring(1,3))<=8){
                cnt=10;
            }
            else if(9<=Integer.parseInt(id.substring(1,3)) && Integer.parseInt(id.substring(1,3))<=15){
                cnt=12;
            }
            else{
                cnt=14;
            }
        }
        else{
            if(1<=Integer.parseInt(id.substring(1,3)) && Integer.parseInt(id.substring(1,3))<=3){
                cnt=8;
            }
            else if(4<=Integer.parseInt(id.substring(1,3)) && Integer.parseInt(id.substring(1,3))<=8){
                cnt=9;
            }
            else if(9<=Integer.parseInt(id.substring(1,3)) && Integer.parseInt(id.substring(1,3))<=15){
                cnt=11;
            }
            else{
                cnt=13;
            }
        }
        return cnt;
    }

    public String getRoleId() {
        return roleId;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+profit;
    }
}
