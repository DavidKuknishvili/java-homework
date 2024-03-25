package chapter_10;

public class N1 {
    public static void main(String[] args) {

        Time time1 = new Time();

        Time time2 = new Time(555550000);
        System.out.println("time 1: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        System.out.println("time 2: " + time2.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());

    }
}

class Time{

    int hour;
    int minute;
    int second;

    public int getHour() {
        return hour;
    }

    public Time() {
        long currentTime = System.currentTimeMillis();
        this.setTime(currentTime);
    }

    public Time(long elapseTime) {
        setTime(elapseTime);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    void setTime(long elapseTime){

        long totalSeconds = elapseTime / 1000;
        this.second = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        this.minute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        this.hour = (int) (totalHours % 24);


    }


}
