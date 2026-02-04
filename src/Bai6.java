import java.util.ArrayList;

public class Bai6 {
    static abstract class Shape {
        abstract double area();
    }
    static class Circle extends Shape {
        double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        public Circle() {
            this.radius = 1;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }
    static class Rectangle extends Shape {
        double width;
        double height;
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        public Rectangle(double side) {
            this.width = side;
            this.height = side;
        }

        @Override
        double area() {
            return width * height;
        }
    }
    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(3));
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Circle(2));
        shapes.add(new Rectangle(6));


    }
}
