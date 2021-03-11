import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Student cody = new Student("Cody");
        Student wang = new Student("Wang");
        ArrayList<Course> courses = new ArrayList<Course>(8);
        Course english = new Course("English", 90);
        courses.add(english);
        Course english2 = new Course("English", 90);
        courses.add(english2);
        Course english3 = new Course("English", 90);
        courses.add(english3);
        Course english4 = new Course("English", 90);
        courses.add(english4);
        Course english5 = new Course("English", 90);
        courses.add(english5);
        Course english6 = new Course("English", 90);
        courses.add(english6);
        Course english7 = new Course("English", 90);
        courses.add(english7);

        System.out.println(english);
        System.out.println(cody);
        System.out.println(wang);
        System.out.println(courses.toString());



        
    }

}
