package day6;

public class Motorbike {

    private String model;
    private int yearOfRelease;
    private String color;

    public String getModel() {
        return model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public Motorbike(String model, int yearOfRelease, String color) {
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.color = color;

    }

    void info() {
        System.out.println("Это мотоцикл" + " " + model);
    }

    void yearDifference(int inputyearOfRelease) {
        int yearDifference = inputyearOfRelease - yearOfRelease;
        if (inputyearOfRelease < yearOfRelease) {
            System.out.println("Неверный ввод, ввод должен быть больше года выпуска");
        } else {
            System.out.println("разница между переданным годом и годом выпуска транспортного средства" + " " + yearDifference + " " + "год");
        }
    }
}
