package sample;

public class Friend {
    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    private int age;

    public Friend(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;

    }
    public String toString(){
        return name;
    }
}
