package chapter_9;

public class N1 {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(4,40);

        Rectangle rect2 = new Rectangle(3.5,35.9);

        System.out.println("rect1 - \nWidth:" + rect1.width +"\nHeight:" + rect1.height + "\nArea: "+  rect1.getArea() + "\nPerimeter: "+ rect1.getPerimeter() );
        System.out.println("\nrect2 - \nWidth:" + rect2.width +"\nHeight:" + rect2.height + "\nArea: "+  rect2.getArea() + "\nPerimeter: "+ rect2.getPerimeter() );

    }
}
class Rectangle {

    double width = 1;
    double height = 1;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {

        return width * height;
    }

    double getPerimeter(){
        return 2 * (width + height);
    }

}
