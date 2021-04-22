import java.util.ArrayList;

public class School {
    //fields
    private String schoolName;
    private int numberOfStudents;
    private String levelOfEducation;
    //getters and setters
    public String getSchoolName(){
        return schoolName;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getLevelOfEducation(){
        return levelOfEducation;
    }
    public void setNumberOfStudents(int newNumberOfStudents){
        this.numberOfStudents = newNumberOfStudents;
    }
    //constructor to build the School method
    School(String schoolName, int numberOfStudents,String levelOfEducation){
        this.schoolName = schoolName;
        this.numberOfStudents = numberOfStudents;
        this.levelOfEducation = levelOfEducation;
    }

    public static void main(String[]args){
        //arraylist of students and teachers
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();


        //adding 10 students and 3 teachers
        Student cody = new Student("Cody", "Wang", 8);
        students.add(cody);
        Student Jimmy = new Student("Jimmy", "Wow", 9);
        students.add(Jimmy);
        Student Paul = new Student("Paul", "Waffle", 12);
        students.add(Paul);
        Student Goat = new Student("Goat", "Orange", 8);
        students.add(Goat);
        Student Duck = new Student("Duck", "Mango", 10);
        students.add(Duck);
        Student Orange = new Student("Orange", "Banana", 11);
        students.add(Orange);
        Student Table = new Student("Table", "Clone", 12);
        students.add(Table);
        Student Sand = new Student("Sand", "Smurf", 9);
        students.add(Sand);
        Student Doug = new Student("Doug", "Salt", 8);
        students.add(Doug);
        Student Cat = new Student("Cat", "Happy", 8);
        students.add(Cat);

        Teacher troy = new Teacher("Troy", "Bolton", "Science");
        teachers.add(troy);
        Teacher Sun = new Teacher("Sun", "Fast", "English");
        teachers.add(Sun);
        Teacher Phil = new Teacher("Phil", "Speed", "Math");
        teachers.add(Phil);
//displaying both lists
        System.out.println(teachers.toString());
        System.out.println(students.toString());
        //removing 2 students and 1 teacher
        students.remove(Cat);
        students.remove(Doug);
        teachers.remove(Sun);
        //displaying both lists
        System.out.println(teachers.toString());
        System.out.println(students.toString());


    }

    }


