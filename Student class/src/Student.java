public class Student {
    private String firstName;
    private static int StudentIDGenerator = 0;
    private int StudentID;
    private int totalMarks;
    Course[] courses;
    int index = 0;
    Student(String firstName, int totalMarks) {
        this.firstName = firstName;
        this.totalMarks = totalMarks/8;
        StudentID = StudentIDGenerator;
        StudentIDGenerator++;
        courses = new Course[8];

    }
    public void addCourse(Course course){
        if(index==8){
            return;
        }
        courses[index] = course;
        index++;

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
        return "firstName: " + firstName + "\n StudentID: " +StudentID+ "\n Average Grade: " +totalMarks;
    }

    }

