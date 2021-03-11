public class Student {
    private String firstName;
    private static int StudentIDGenerator = 0;
    private int StudentID;



    Student(String firstName) {
        this.firstName = firstName;

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
        return "firstName: " + firstName + "\n StudentID: " +StudentID;
    }

    }

