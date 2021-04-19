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


    public void setHour(int newHour) {
        if (newHour>24){
            newHour = 0;
        }

        hour = newHour;

    }


    public void setMinute(int newMinute) {
        if (newMinute>24){
            newMinute = 0;
        }
        minute = newMinute;
    }

    public void setSecond(int newSecond){
        if (newSecond>60){
            newSecond = 0;
        }
        second = newSecond;
    }




            public void setTime ( int newH, int newM, int newS){
                hour = newH;
                minute = newM;
                second = newS;

            }


            public void nextHour () {
                hour = hour + 1;
            }

            public void nextMinute () {
                minute = minute + 1;
            }



            public int nextSecond () {
                second = second + 1;
                if (second > 59) {
                    second = 0;
                    minute = minute + 1;
                }
                if (minute > 59) {
                    minute = 0;
                    hour = hour + 1;
                }
                if (hour > 24) {
                    hour = 0;
                }
                if (hour < 10) {

                }
                return second;
            }
            public int previousSecond () {
                second = second - 1;
                if (second < 0) {
                    second = 59;
                    minute = minute - 1;
                }
                if (minute < 0) {
                    minute = 59;
                    hour = hour - 1;
                }
                if (hour < 0) {
                    hour = 24;
                    second = 59;

                }
                return second;
            }


            public String toString () {
        if(hour<10 && minute<10 && second<10) return "\n Time: 0" + hour + ":0" + minute + ":0" + second;
        if(hour<10 && minute<10 && second>10) return  "\n Time: 0" + hour + ":0" + minute + ":" + second;
        if(hour<10 && minute>10 && second>10) return "\n Time: 0" + hour + ":" + minute + ":" + second;
        if(hour<10 && minute>10 && second<10) return "\n Time: 0" + hour + ":" + minute + ":0" + second;

            else
                return "\n Time: " + hour + ":" + minute + ":" + second;

            }
        }