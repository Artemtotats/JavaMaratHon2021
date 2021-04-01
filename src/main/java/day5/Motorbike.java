package day5;

public class Motorbike {

    private String model;
    private int yearOfRelease;
    private String color;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motorbike(String model, int yearOfRelease, String color) {
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.color = color;

    }
}
