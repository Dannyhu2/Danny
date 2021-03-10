public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private static int StudentIDGenerator = 0;
    private int StudentID;

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public int grade(){return grade;}


    Student(String firstName, String lastName, int grade){
        this.firstName =firstName;
        this.lastName= lastName;
        this.grade = grade;
        StudentID = StudentIDGenerator;
        StudentIDGenerator++;


    }
    Student(){
        System.out.println("Default Constructor");
        StudentID = StudentIDGenerator;
        StudentIDGenerator++;

    }
    public int getStudentIDGenerator(){
        return StudentIDGenerator;
    }
    public String toString(){
        return "name: "+firstName + " " + lastName + "\n grade: "+ grade;
    }
}
