package duthiICPC;

public class Register implements Comparable<Register> {
    private String schoolId;
    private String teamId;
    private String teamName;
    private School school;

    public Register(String schoolId, String teamName) {
        this.teamId = "";
        this.schoolId = schoolId;
        this.teamName = teamName;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return teamId+" "+teamName+" "+school.getName();
    }

    @Override
    public int compareTo(Register o) {
        if(!this.school.getName().equals(o.school.getName())){
            return this.school.getName().compareTo(o.school.getName());
        }
        return this.teamName.compareTo(o.teamName);
    }
}
