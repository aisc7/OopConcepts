package domain.model;

public class Circle extends Shape {
    private int radius = 0;

    public Circle(int newRadius) {
        setRadius(newRadius);
    }

    public Circle() {

    }

    public void setRadius(int newRadius) {
        if (newRadius >= 0 && newRadius <= 1000)

            radius = newRadius;

    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
