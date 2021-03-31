package day4;

import java.util.Random;


public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }
        int max = 0;
        for (int maxelemnt : numbers
        ) {
            if (maxelemnt > max) {
                max = maxelemnt;
            }
        }
        System.out.println("Найбольштй элемент массива = " + max);
        int min = 10000;
        for (int minelemnt : numbers
        ) {
            if (minelemnt < min) {
                min = minelemnt;
            }
        }
        System.out.println("Найменьший элемент массива = " + min);
        int count =0;
        for (int countelemnt:numbers
        ) { if ( countelemnt % 10 == 0){
            count++;
        }

        }
            System.out.println("Кол-во элементов на 0 = " +count);
        int sum =0;
        for (int countelemnt:numbers
        ) { if ( countelemnt % 10 == 0){
            sum= sum+ countelemnt;
        }

        }
        System.out.println("Сумма элементов  массива = " +sum);
    }
}