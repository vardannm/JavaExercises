public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5); // radius = 5
        Shape rectangle = new Rectangle(4, 6); // length = 4, width = 6
        Shape triangle = new Triangle(3, 4, 3, 4, 5); // base = 3, height = 4, sides = 3, 4, 5

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("-------------------");

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("-------------------");

        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
