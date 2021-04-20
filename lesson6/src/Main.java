import java.io.*;
import java.util.ArrayList;

public class Main {
    private String word;
    
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        br.close();
        for (String s : lines) {
            System.out.println(s);
        }

        FileWriter fw = new FileWriter("line1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.close();

for(int i = 0; i<lines.size();i++)
            if (lines.get(i++).contains("the") == true) {

            }
        System.out.println("found");
        System.out.println(lines.get(0).indexOf("the"));
        System.out.println(lines.get(2).indexOf("the"));
        System.out.println(lines.get(5).indexOf("the"));
        System.out.println(lines.get(6).indexOf("the"));
        System.out.println(lines.get(8).indexOf("the"));
        System.out.println(lines.get(12).indexOf("the"));
        System.out.println(lines.get(13).indexOf("the"));
        System.out.println(lines.get(14).indexOf("the"));

    }
}

