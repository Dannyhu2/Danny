import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[]args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) !=null){
            //System.out.println("line " + line);
            lines.add(line);
        }
br.close();
        for(String s : lines){
            System.out.println(s);
        }

        FileWriter fw = new FileWriter("line1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(lines.get(0));
        bw.close();



        }

    }

