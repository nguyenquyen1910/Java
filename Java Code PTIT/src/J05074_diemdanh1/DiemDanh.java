package J05074_diemdanh1;

public class DiemDanh {
    private String studentId,work;
    private int score;
    public DiemDanh(String studentId, String work) {
        this.studentId=studentId;
        this.work=work;
        this.score=solveScore();
    }
    public String getStudentId(){
        return studentId;
    }

    public int solveScore(){
        int res=10;
        for(int i=0;i<work.length();i++){
            if(work.charAt(i)=='m'){
                res-=1;
            }
            else if(work.charAt(i)=='v'){
                res-=2;
            }
        }
        return Math.max(res, 0);
    }

    public int getScore() {
        return score;
    }
}
