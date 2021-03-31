package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи число а");
        int a = input.nextInt();
        System.out.println("Введи число b");
        int b = input.nextInt();
        int z = a+1;
        while (z < b){
            z ++;
            if (z % 5 == 0 && z % 10 != 0) {
                System.out.println(z);
            }

            }
    }
}
