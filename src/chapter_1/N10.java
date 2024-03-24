package chapter_1;

public class N10 {
    public static void main(String[] args) {
        double minutes = 45.;
        double seconds = 30.;


        double miles = 14.0 / 1.6;

        double totalTimeInHours = (minutes * 60 + seconds) / 3600.0;
        double speed = miles / totalTimeInHours;

        System.out.println(speed);


    }
}
