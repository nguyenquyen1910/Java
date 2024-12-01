package J05062_hocbongsinhvien;

public class Student {
    private String name;
    private Double gpa;
    private Double trainingScore;
    private String status;
    private int index;

    public Student(String name, Double gpa, Double trainingScore, int index) {
        this.name = name;
        this.gpa = gpa;
        this.trainingScore = trainingScore;
        this.index = index;
        this.status = handleStatus();
    }

    public Double getGpa() {
        return gpa;
    }

    public Double getTrainingScore() {
        return trainingScore;
    }

    public int getIndex() {
        return index;
    }

    private String handleStatus() {
        if (gpa >= 3.6 && trainingScore >= 90) {
            return "XUATSAC";
        }
        if (gpa > 3.2 && trainingScore >= 80) {
            return "GIOI";
        }
        if (gpa > 2.5 && trainingScore >= 70) {
            return "KHA";
        }
        return "KHONG";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name+": "+status;
    }
}
