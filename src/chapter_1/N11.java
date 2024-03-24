package chapter_1;

public class N11 {
    public static void main(String[] args) {

        double birthRate = 7.;
        double deathRate = 13.;
        double immigrantRate = 45.;

        double currentPopulation = 312032486;
        double yearsInSec  = 60 * 60 * 24  * 365;


        double birth = yearsInSec / birthRate;
        double death = yearsInSec / deathRate;
        double immigrant = yearsInSec / immigrantRate;


        for (int i = 1; i <= 5; i++) {
            currentPopulation = currentPopulation + (birth + immigrant - death);
            System.out.printf("%d year: %d\n", i, (int)currentPopulation);
        }


    }
}
