package day5;

public class Motorbike {
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

    private String model;
    private    int yearOfRelease;
    private String color;

}
