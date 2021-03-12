public class Time {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;



    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public void setHour(int newHour){
        if (newHour>24){
            newHour = 0;
        }
        hour = newHour;

    }
    public void setMinute(int newMinute){
        if (newMinute>59){
            newMinute = 0;

        }
        minute = newMinute;
    }
    public void setSecond(int newSecond){
        if (newSecond>59){
            newSecond = 0;

        }
        second = newSecond;
    }
    public void setTime(int newH, int newM, int newS){
        hour = newH;
        minute = newM;
        second = newS;

    }
    public int nextSecond(){
        second = second+1;
        if(second>59) {
            second = 0;
            minute = minute + 1;
        }
        if (minute > 59) {
            minute = 0;
            hour = hour + 1;
        }
        if (hour > 24){
            hour = 0;
        }
        if (hour < 10){
            
        }
        return second;
    }
    public int previousSecond(){
        second = second-1;
        if(second < 0){
            second = 59;
            minute = minute -1;
        }
        if(minute < 0){
            minute = 59;
            hour = hour -1;
        }
        if(hour < 0){
            hour = 24;
            second = 59;

        }
        return second;
    }


    public String toString(){
        return "\n Time: "+hour + ":" + minute + ":"+ second;
    }
}
