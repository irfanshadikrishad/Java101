import java.lang.Math;

public class Shapper {
    public static void main(String[] args) {
        abstract class Shape {

            abstract double printArea();
        }

        class Circle extends Shape {
            private double radius;

            Circle(double radius) {
                this.radius = radius;
            }

            double printArea() {
                return Math.PI * (radius * radius);
            };
        }

        Circle circle = new Circle(5);
        System.out.println(circle.printArea());
    }
}
