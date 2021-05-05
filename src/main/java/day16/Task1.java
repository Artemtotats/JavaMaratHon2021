package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class
Task1 {
    public static void main(String[] args) {
        File file = new File("text");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numers = line.split(" ");
            int sum = 0;
            for (String number : numers) {
                sum += Integer.parseInt(number);
            }
            double result = (double) sum / numers.length;
            System.out.printf(result + "--> %3f", result);


        } catch (FileNotFoundException e) {
            System.out.println("Фаил не найден");

        }
    }
}

