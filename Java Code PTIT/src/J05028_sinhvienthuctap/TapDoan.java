package J05028_sinhvienthuctap;

public class TapDoan implements Comparable<TapDoan> {
    private String id;
    private String name;
    private int students;
    public TapDoan(String id, String name, int students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+students;
    }

    @Override
    public int compareTo(TapDoan o) {
        if(this.students!=o.students){
            return o.students-this.students;
        }
        return this.id.compareTo(o.id);
    }

    public int getStudents() {
        return students;
    }
}
