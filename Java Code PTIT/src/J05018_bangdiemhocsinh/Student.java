package J05018_bangdiemhocsinh;

public class Student implements Comparable<Student> {
    private String id,name,rating;
    public Float mean;
    public Student(int k,String name, float[] p) {
        this.id = String.format("HS%02d", k+1);
        this.name = name;
        mean = 0f;
        for(int i=0;i<10;i++) {
            mean+=p[i]*((i==0 || i==1) ? 2f : 1f);
        }
        mean /= 12f;
        mean = Math.round(mean * 10f) / 10f;
    }
    public String getRating() {
        if (mean >= 9f) return "XUAT SAC";
        else if (mean >= 8f) return "GIOI";
        else if (mean >= 7f) return "KHA";
        else if (mean >= 5f) return "TB";
        return "YEU";
    }

    @Override
    public int compareTo(Student o) {
        if(this.mean.compareTo(o.mean)!=0){
            return o.mean.compareTo(this.mean);
        }
        else{
            return this.id.compareTo(o.id);
        }
    }

    @Override
    public String toString() {
        return id+" "+name+" "+String.format("%.1f",mean)+" "+getRating();
    }
}
