public class Teacher {
    //fields
    private String firstName;
    private String lastName;
    private String subject;

//getters and setters
    public String getFirstName(){ return firstName;}
    public String getLastName(){ return lastName;}
    public String getSubject(){ return subject;}

    public void setSubject(String newSubject){
        this.subject = newSubject;
    }
//constructor to build the teacher method
    Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }
    //toString to display the teacher
    public String toString() {
        return "\nName: " + firstName + " " + lastName + " Subject: " + subject;
    }
}
