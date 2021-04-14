package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 20, 30, 20),
                new Triangle("Red", 20, 15, 20),
                new Rectangle("Red", 10, 30),
                new Rectangle("Orange", 15, 20),
                new Circle("Orange", 5),
                new Circle("Red", 12),
                new Circle("Blue", 6)
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }
    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                sum = sum + figure.perimeter();
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                sum = sum + figure.area();
        }
        return sum;
    }
}
