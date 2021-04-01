package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter=0;
        while (counter<6) {
            counter++;
            double delimoe = scanner.nextDouble();
            double delitel = scanner.nextDouble();
            if (delimoe == 0){
                System.out.print("Деление на 0");
            continue;
        }

            System.out.print(delimoe / delitel);


        }
    }
}