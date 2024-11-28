import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MatHang {
    private String id;
    private String name;
    private String dvt;
    private int giaBan;
    private int giaMua;
    private int loiNhuan;
    public MatHang(int i,String name,String dvt,int giaBan,int giaMua){
        this.id="MH"+String.format("%04d", i+1);
        this.name=name;
        this.dvt=dvt;
        this.giaBan=giaBan;
        this.giaMua=giaMua;
        this.loiNhuan=this.giaBan-this.giaMua;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDvt() {
        return dvt;
    }
    public int getGiaBan() {
        return giaBan;
    }
    public int getGiaMua() {
        return giaMua;
    }
    public int getLoiNhuan() {
        return loiNhuan;
    }
    @Override
    public String toString() {
        return this.id+" "+this.name+" "+this.dvt+" "+this.giaBan+" "+this.giaMua+" "+this.loiNhuan;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        MatHang[] ds=new MatHang[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            String name=sc.nextLine(),dvt=sc.nextLine();
            int giaBan=sc.nextInt(),giaMua=sc.nextInt();
            ds[i]=new MatHang(i,name,dvt,giaMua,giaBan);
        }
        Arrays.sort(ds,new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1,MatHang o2){
                if(o1.getLoiNhuan()!=o2.getLoiNhuan()){
                    return o2.getLoiNhuan()-o1.getLoiNhuan();
                }
                else{
                    return o1.getId().compareTo(o2.getId());
                }
            }
        });
        for(int i=0;i<n;i++){
            System.out.println(ds[i].toString());
        }
    }
}
