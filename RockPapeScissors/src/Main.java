import com.sun.corba.se.spi.orbutil.threadpool.NoSuchWorkQueueException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int random = (int)(Math.random()*100);
        int choice = Integer.parseInt(scan.next());
        int a = (int)(Math.random()*3);
        System.out.println(a);
        int r = 1;
        int p = 2;
        int s = 3;
        System.out.println(a==r);
        System.out.println(a==p);
        System.out.println(a==s);

        if (a==1) {
            System.out.println("Computer Chooses Rock");
        }
        if (a==2) {
            System.out.println("Computer Chooses Paper");
        }
        if (a==3) {
            System.out.println("Computer Chooses Scissors");
        }


    }
}