package chapter_1;

public class N12 {
    public static void main(String[] args) {
        double hours = 1.;
        double minutes = 40.;
        double seconds = 35.;

        double distanceInKM = 24 * 1.6;

        double allTimeInHours = hours + minutes / 60 + seconds / 3600;

        double averageSpeed = distanceInKM / allTimeInHours;

        System.out.println(averageSpeed);

    }
}
