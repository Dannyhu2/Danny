public class Student {
    private String firstName;
    private static int StudentIDGenerator = 0;
    private int StudentID;

    Student(String firstName) {
        this.firstName = firstName;
        this.StudentID = StudentIDGenerator;
        StudentID++;
    }
    Student(){
        System.out.println("Default Constructor");
        StudentID = StudentIDGenerator;
        StudentID++;
    }
    public int getStudentIDGenerator(){
        return StudentIDGenerator;
    }
    public String toString(){
        return "firstName: " + firstName + "\n StudentID: " +StudentID;
    }

    }

