package TN02012_tinhluong;

public class NhanVien {
    private String cusId;
    private String cusName;
    private Integer daySalary;
    private Integer dayOfWork;
    private Integer totalSalary;
    private PhongBan phongBan;

    public NhanVien(String cusId, String cusName, Integer daySalary, Integer dayOfWork) {
        this.cusId = cusId;
        this.cusName = cusName;
        this.daySalary = daySalary;
        this.dayOfWork = dayOfWork;
        this.totalSalary = solveTotalSalary();
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public String getCusId() {
        return cusId;
    }

    private Integer solveTotalSalary() {
        Integer res = 0;
        if(cusId.charAt(0)=='A'){
            int exp = Integer.parseInt(cusId.substring(1,3));
            if(1<=exp && exp<=3){
                res=daySalary*dayOfWork*10;
            }
            else if(4<=exp && exp<=8){
                res=daySalary*dayOfWork*12;
            }
            else if(9<=exp && exp<=15){
                res=daySalary*dayOfWork*14;
            }
            else{
                res=daySalary*dayOfWork*20;
            }
        }
        else if(cusId.charAt(0)=='B'){
            int exp = Integer.parseInt(cusId.substring(1,3));
            if(1<=exp && exp<=3){
                res=daySalary*dayOfWork*10;
            }
            else if(4<=exp && exp<=8){
                res=daySalary*dayOfWork*11;
            }
            else if(9<=exp && exp<=15){
                res=daySalary*dayOfWork*13;
            }
            else{
                res=daySalary*dayOfWork*16;
            }
        }
        else if(cusId.charAt(0)=='C'){
            int exp = Integer.parseInt(cusId.substring(1,3));
            if(1<=exp && exp<=3){
                res=daySalary*dayOfWork*9;
            }
            else if(4<=exp && exp<=8){
                res=daySalary*dayOfWork*10;
            }
            else if(9<=exp && exp<=15){
                res=daySalary*dayOfWork*12;
            }
            else{
                res=daySalary*dayOfWork*14;
            }
        }
        else{
            int exp = Integer.parseInt(cusId.substring(1,3));
            if(1<=exp && exp<=3){
                res=daySalary*dayOfWork*8;
            }
            else if(4<=exp && exp<=8){
                res=daySalary*dayOfWork*9;
            }
            else if(9<=exp && exp<=15){
                res=daySalary*dayOfWork*11;
            }
            else{
                res=daySalary*dayOfWork*13;
            }
        }
        return res*1000;
    }

    @Override
    public String toString() {
        return cusId+" "+cusName+" "+phongBan.getRoomName()+" "+totalSalary;
    }
}
