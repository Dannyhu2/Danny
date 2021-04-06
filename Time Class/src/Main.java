public class Main {
    public static void main(String[]args){
        Time clock = new Time();

        System.out.println(clock);
        clock.setHour(9);
        System.out.println(clock);
        clock.setTime(2,59,59);
        clock.nextSecond();
        clock.previousSecond();
        clock.nextSecond();
        clock.nextSecond();
        System.out.println(clock);

    }
}
