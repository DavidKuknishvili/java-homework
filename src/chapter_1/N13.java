package chapter_1;

public class N13 {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = .50;
        double e = 44.5;
        double f = 5.9;

        double x = (e*d -b*f)/(a*d -b*c);
        double y = (a*f -e*c)/(a*d- b*c);

        System.out.printf("X = %f\n", x);
        System.out.printf("Y = %f", y);



    }
}
