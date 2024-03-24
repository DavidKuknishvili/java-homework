package chapter_9;

public class N9 {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon(6,4);
        RegularPolygon polygon2 = new RegularPolygon(10,4,5.6, 7.5);


        System.out.println("Polygon 1 - Perimeter: " + polygon1.getPerimeter() + ", Area: " + polygon1.getArea());

        // Display perimeter and area for polygon2
        System.out.println("Polygon 2 - Perimeter: " + polygon2.getPerimeter() + ", Area: " + polygon2.getArea());


    }
}

class RegularPolygon{
    private int n;
    private double side;
    private double x;
    private double y;

    // No-argument constructor
    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    double getPerimeter (){
        return  n * side;

    }
    double getArea (){
        return  ( n * side * side) / (4 * Math.tan(Math.PI / n));


    }

}
