package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
while (true){
         double delimoe = scanner.nextDouble();
        double delitel = scanner.nextDouble();
        if (delimoe==0)
            break;

            System.out.print( delimoe/delitel );


        }
    }
}
