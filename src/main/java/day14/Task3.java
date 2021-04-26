package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjectList());
    }

    public static List<Person> parseFileToObjectList() {
        File file = new File("people.txt");
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();
                Person currentPerson = new Person(person[0], Integer.parseInt(person[1]));
                people.add(currentPerson);

            }
            return people;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("некоректный ввод данных");
        }
        return null;
    }
}
