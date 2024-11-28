package J05026_danhsachgiangvientheomon;

public class GiangVien {
    private String id,name,major,nameMajor;

    public GiangVien(int i, String name, String major) {
        this.id = "GV"+String.format("%02d",i+1);
        this.name = name;
        this.major = major;
        this.nameMajor=nameMajorSolve();
    }
    public String nameMajorSolve(){
        String[] tmp=major.split("\\s+");
        String res="";
        for(String x : tmp){
            x=x.toUpperCase();
            res+=x.charAt(0);
        }
        return res;
    }
    public String getNameMajor(){
        return nameMajor;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+nameMajor;
    }
}
