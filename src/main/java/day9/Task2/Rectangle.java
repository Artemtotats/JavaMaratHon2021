package day9.Task2;

public class Rectangle extends Figure {
    private double h;
    private double l;

    public Rectangle(String color, double h, double l) {
        super(color);
        this.l = l;
        this.h = h;
    }

    @Override
    public double area() {
        return l * h;
    }

    @Override
    public double perimeter() {
        return (l + h) * 2;
    }
}
