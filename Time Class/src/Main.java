public class Main {
    public static void main(String[]args){
        Time clock = new Time();
<<<<<<< HEAD
        System.out.println(clock);
        clock.setHour(9);
        System.out.println(clock);
=======

        clock.setTime(2,59,59);
        clock.nextSecond();
        clock.previousSecond();
        clock.nextSecond();
        clock.nextSecond();
        System.out.println(clock);

>>>>>>> 94fe5e862efb852a10829f87033f837f57bbf5ec
    }
}
