public class Main {
    public static void main(String[] args) {
    Employee employee = new Employee(2,"Cody","Wang",24345);
        System.out.println(employee.getId());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        employee.setSalary(50000);
        System.out.println(employee.getSalary());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(100));
        System.out.println(employee);



    }
}
