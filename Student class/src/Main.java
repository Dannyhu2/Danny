public class Main {
    public static void main(String[] args){
        Course[] array = new Course[8];
        for (int i = 0; i < array.length; i++)
            array[i] = new Course("math", 77);
        Student student = new Student("Cody",700);
        System.out.println(student);
        System.out.println(array);
    }
}
