package day9.Task2;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double H = perimeter() / 2;
        return Math.sqrt((H * (H - a) * (H - b) * (H - c)));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
