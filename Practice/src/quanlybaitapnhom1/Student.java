package quanlybaitapnhom1;

public class Student implements Comparable<Student> {
    private String stuId;
    private String stuName;
    private String stuPhone;
    private int exId;
    private Exercise exercise;
    public Student(String stuId, String stuName, String stuPhone, int exId) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuPhone = stuPhone;
        this.exId = exId;
    }

    public String getStuId() {
        return stuId;
    }

    public int getExId() {
        return exId;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    @Override
    public String toString() {
        return stuId+" "+stuName+" "+stuPhone+" "+exId+" "+exercise.getExName();
    }

    @Override
    public int compareTo(Student o) {
        return this.stuId.compareTo(o.stuId);
    }
}
