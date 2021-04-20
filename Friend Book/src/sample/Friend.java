package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
    public void writeToFile() throws IOException{
        FileWriter fw = new FileWriter("friends.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name+",\r");
        bw.write(phoneNumber+ "\r");
        bw.write(Integer.toString(age)+";\r");
        bw.write(";\r");
        bw.close();

    }
}
