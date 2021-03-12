public class Main {
    public static void main(String[]args){
        Time clock = new Time();

        clock.setTime(2,59,59);
        clock.nextSecond();
        clock.previousSecond();
        clock.nextSecond();
        clock.nextSecond();
        System.out.println(clock);

    }
}
