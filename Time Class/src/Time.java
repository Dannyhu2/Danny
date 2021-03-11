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
        hour = newHour;
    }
    public void setMinute(int newMinute){
        minute = newMinute;
    }
    public void setSecond(int newSecond){
        second = newSecond;
    }
    public void setTime(int newH, int newM, int newS){
        hour = newH;
        minute = newM;
        second = newS;
    }
    public String toString(){
        if( second <10 && second >0){
            second;
        }
        return "\n Time: "+hour + ":" + minute + ":"+ second;
    }
}
