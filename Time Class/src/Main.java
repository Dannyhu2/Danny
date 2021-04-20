public class Main {
    public static void main(String[]args){
        Time clock = new Time();

        System.out.println(clock);
        clock.setHour(9);
        System.out.println(clock);
        clock.setTime(21,3,21);
        clock.nextSecond();
        clock.previousSecond();
        clock.nextSecond();
        clock.nextSecond();
        System.out.println(clock);

    }
}
