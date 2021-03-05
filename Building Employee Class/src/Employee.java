public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // setters, getters and other methods
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        salary = (salary*(percent/100) + salary);
        return salary;
    }
    public void setSalary(int newSalary){
        this.salary = newSalary;
    }
//Constructor
    Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        System.out.println("Employee Created");
    }
    public String toString(){
        return "Employee: \n id: " + id + "\n Name: " +firstName + " " + lastName + "\n salary: " + salary;
    }

}
