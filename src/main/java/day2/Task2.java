package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи число а");
        int a = input.nextInt();
        System.out.println("Введи число b");
        int b = input.nextInt();
        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {

                System.out.println(i);
            }

        }
    }
}
