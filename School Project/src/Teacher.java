public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;


    public String getFirstName(){ return firstName;}
    public String getLastName(){ return lastName;}
    public String getSubject(){ return subject;}

    public void setSubject(String newSubject){
        this.subject = newSubject;
    }

    Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }
    Teacher(){
        System.out.println("Default Constructor");





    }
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n Subject: " + subject;
    }
}
