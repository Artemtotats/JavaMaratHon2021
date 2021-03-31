package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи количество этажей дома");
        int a;
        a = input.nextInt();

        if (1<=a && a <= 4){
            System.out.println("Малоэтажный дом");
        }
        if ( 5<= a && a <= 8){
            System.out.println("Среднеэтажный дом");
        }
        if (a >= 9) {
            System.out.println("Многоэтажный дом");
        }
            if (a <= 0){
                System.out.println("Неверный ввод");
            }
        }
    }

