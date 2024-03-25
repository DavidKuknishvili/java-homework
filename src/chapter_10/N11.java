package chapter_10;

public class N11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Perimeter of c1: " + c1.getPerimeter());
        System.out.println("c1 contain point (3, 3)? " + c1.contains(3, 3));
        System.out.println("c1 contain ? " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1 overlap? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

class  Circle2D{

    double x;
    double y;
    double radius;

    public double getRadius() {
        return radius;
    }

    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {

        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public  boolean contains(double x, double y ){
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
    }


    public  boolean contains(Circle2D circle ){
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distance + circle.radius < this.radius;
    }

    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distance < this.radius + circle.radius && !contains(circle);
    }
}