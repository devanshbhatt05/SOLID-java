public interface Shape {
    double area();
}
public class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double area() {
        return length * width;
    }
}
public class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
public class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.area();
    }
}
public class test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);
        AreaCalculator areaCalculator = new AreaCalculator();
        double rectangleArea = areaCalculator.calculateArea(rectangle);
        double circleArea = areaCalculator.calculateArea(circle);
        System.out.println("Rectangle area: " + rectangleArea);
        System.out.println("Circle area: " + circleArea);
    }
}
