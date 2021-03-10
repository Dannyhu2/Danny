import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        //10 students
        Student cody = new Student("Cody", "Wang", 8);
        students.add(cody);
        Student ryan = new Student("Ryan", "He", 11);
        students.add(ryan);
        Student john = new Student("John", "Ye", 9);
        students.add(john);
        Student gavin = new Student("Gavin", "Chai", 10);
        students.add(gavin);
        Student danny = new Student("Danny", "Hu", 12);
        students.add(danny);
        Student stephen = new Student("Stephen", "Choi", 12);
        students.add(stephen);
        Student jacky = new Student("Jacky", "Tang", 11);
        students.add(jacky);
        Student eric = new Student("Eric", "Wong", 10);
        students.add(eric);
        Student gabriel = new Student("Gabriel", "Pong", 11);
        students.add(gabriel);
        Student kenny = new Student("Kenny", "Wang", 15);
        students.add(kenny);

        //3 teachers
        Teacher holly = new Teacher("Holly", "Lang", "English");
        teachers.add(holly);
        Teacher phill = new Teacher("Phill", "Swift", "Math");
        teachers.add(phill);
        Teacher troy = new Teacher("Troy", "Bolton", "Science");
        teachers.add(troy);

        System.out.println(teachers.toString());
        System.out.println(students.toString());

    }
}
