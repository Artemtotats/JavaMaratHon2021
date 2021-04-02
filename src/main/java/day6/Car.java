package day6;

public class Car {

    private String model;
    private int yearOfRelease;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    void info() {
        System.out.println("Это автомобиль" + " " + model);
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