package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbas", 2010, 60, 5);
        airplane.setYear(2013);
        airplane.setWeight(12);
        airplane.fillUp(10);
        airplane.fillUp(13);
        airplane.info();
    }
}
