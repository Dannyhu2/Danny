public class Student {
    //fields
    private String firstName;
    private String lastName;
    private int grade;
    private static int StudentIDGenerator = 0;
    private int StudentID;
//getters and setters
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public int grade(){return grade;}
    public void setGrade(int newGrade){
        this.grade = newGrade;
    }

//constructor to build the Student method and a unique id generator
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
    //toString to display the Student
    public String toString(){
        return "\n Name: "+firstName + " " + lastName + " grade: "+ grade + " Student ID: "+ StudentID;
    }
}
