import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList <Employee> Employees = new ArrayList<>();
        Employee John = new Employee();
        Employees.add(John);
        Employees.add(new Employee());
        for(int i=0; i<100;i++) {
            Employees.add(new Employee());
        }
        }




}