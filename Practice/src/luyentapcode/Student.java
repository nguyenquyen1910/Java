package luyentapcode;

public class Student implements Comparable<Student> {
    private String name;
    private int correct, submit;

    public Student(String name, int correct, int submit) {
        this.name = name;
        this.correct = correct;
        this.submit = submit;
    }


    @Override
    public int compareTo(Student o) {
        if(this.correct != o.correct) {
            return o.correct - this.correct;
        }
        if(this.submit != o.submit) {
            return this.submit - o.submit;
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name+" "+correct+" "+submit;
    }
}
