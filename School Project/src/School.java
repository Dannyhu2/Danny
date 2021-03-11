import java.util.ArrayList;

public class School {

    public static void main(String[]args){
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();


        Student cody = new Student("Cody", "Wang", 8);
        students.add(cody);
        Student Jimmy = new Student("Jimmy", "Wang", 8);
        students.add(Jimmy);

        Teacher troy = new Teacher("Troy", "Bolton", "Science");
        teachers.add(troy);


        System.out.println(teachers.toString());
        System.out.println(students.toString());



    }

    }


