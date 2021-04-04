package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplanes1 = new Airplane("Airbas", 2010, 90, 7);
        Airplane airplanes2 = new Airplane("Boing", 2011, 90, 8);
        Airplane.compareAirplanes(airplanes1, airplanes2);
    }
}