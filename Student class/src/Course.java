public class Course {
    private int grade;
    private String subject;

    Course(String subject, int grade) {
        this.grade = grade;
        this.subject = subject;
    }
    public String toString(){
        return "Grade: "+grade + "\n Subject: "+subject;
    }




}
