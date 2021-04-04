package day7;

public class Airplane {

    String producer;
    int year;                                       //(год выпуска)
    int length;                                     // (длина)
    int weight;                                    //(вес)
    int fuel;                                  //(количество топлива в баке)

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public String getProducer() {
        return producer;
    }


    public int getLength() {
        return length;
    }

    public int getFuel() {
        return fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    void fillUp(int inputfuel) {
        fuel += inputfuel;

    }

    void info() {

        System.out.println("Изготовитель:" + " " + producer + " " + " " + "год выпуска:" + " " +
                year + " " + "длина:" + length + " " + "вес:" + " " + weight + " Объем топлива в баке: " + fuel);
    }

    public static void compareAirplanes(Airplane airplanes1, Airplane airplanes2) {
        int differenceLength = Math.abs(airplanes2.getLength() - airplanes1.getLength());
        if (airplanes2.getLength() > airplanes1.getLength()) {
            System.out.println("Длиннее " + airplanes2.getProducer() + " на " + differenceLength + " метров");


        }
        if (airplanes2.getLength() == airplanes1.getLength()){
            System.out.println(   airplanes2.getProducer() + "  и " + airplanes1.getProducer() + " равны");
        }
        else  {
            System.out.println("Длиннее " + airplanes1.getProducer() + " на " + differenceLength + " метров");
        }

    }

}
