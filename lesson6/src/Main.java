import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String input= "Programmable"; //The you want to search for
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        br.close();
        for (String s : lines) {
            if (s.equals(input)){
                count++;
            }
        }


for(int i = 0; i<lines.size();i++)
            if (lines.get(i++).contains(input.toString()) == true) {
            count++;
            }
        System.out.println("found "+ count++ +" "+ input.toString() +"'s" +" at ");
        if(lines.get(0).indexOf(input.toString())>-1) {
            System.out.println("line 1, index position " + lines.get(0).indexOf(input.toString()));
        }else{
            System.out.println("");
        }
        if(lines.get(2).indexOf(input.toString())>-1) {
            System.out.println("line 3, index position " + lines.get(2).indexOf(input.toString()));
        }else{
            System.out.println("");}
        if(lines.get(5).indexOf(input.toString())>-1) {
            System.out.println("line 6, index position " + lines.get(5).indexOf(input.toString()));
        }else{
            System.out.println("");}
        if(lines.get(6).indexOf(input.toString())>-1) {
            System.out.println("line 7, index position " + lines.get(6).indexOf(input.toString()));
        }else{
            System.out.println("");}
        if(lines.get(8).indexOf(input.toString())>-1) {
            System.out.println("line 9, index position " + lines.get(8).indexOf(input.toString()));
        }else{
            System.out.println("");}
        if(lines.get(12).indexOf(input.toString())>-1) {
            System.out.println("line 13, index position " + lines.get(12).indexOf(input.toString()));
        }else{
            System.out.println("");}
        if(lines.get(13).indexOf(input.toString())>-1) {
            System.out.println("line 14, index position " + lines.get(13).indexOf(input.toString()));
        }else{
            System.out.println("");}
        if(lines.get(14).indexOf(input.toString())>-1) {
            System.out.println("line 15, index position " + lines.get(14).indexOf(input.toString()));
        }else{
            System.out.println("");
        }
    }
}

