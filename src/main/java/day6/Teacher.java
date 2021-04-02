package day6;

import java.util.Random;

public class Teacher {
    Random random = new Random();
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    private String lessons;

    public String getName() {
        return name;
    }

    public String getLessons() {
        return lessons;
    }

    public Teacher(String name, String lessos) {
        this.name = name;
        this.lessons = lessos;
    }

    public void evaluate(Student student) {
        int randomValuation = random.nextInt(4) + 2;
        String evaevaluate = "";
        switch (randomValuation) {
            case 2:
                evaevaluate = "Неудовлетворительно";
                break;
            case 3:
                evaevaluate = "Удовлетворительно";
                break;
            case 4:
                evaevaluate = "Хорошо";
                break;

            case 5:
                evaevaluate = "Отлично";
                break;
        }
        System.out.println("Преподователь " + name + " оценил стуьента " + student.getName() + " по предмету " +
                lessons + " на оценку" + " " + randomValuation );
    }
}




