package day6;


public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Жолтый");
        car.setYearOfRelease(2010);
        car.setModel("BMW");
        Motorbike motorbike = new Motorbike("HONDA", 1999, "Синий");
        motorbike.info();
        motorbike.yearDifference(2000);
        car.info();
        car.yearDifference(2020);

    }
}
