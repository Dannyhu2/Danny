public class Student {
    private String firstName;
    private static int StudentIDGenerator = 0;
    private int StudentID;
    Course[] courses;
    int index = 0;
    Student(String firstName) {
        this.firstName = firstName;
        StudentID = StudentIDGenerator;
        StudentIDGenerator++;
        courses = new Course[8];

    }
    int total = 0;
    public static int findAverage(int total){
    total/index
    return;
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
        return "firstName: " + firstName + "\n StudentID: " +StudentID;
    }

    }

