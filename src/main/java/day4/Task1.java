package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int  n = scanner.nextInt();
        int[] numbers =  new int[n] ;
        for (int i = 0; i < numbers.length; i++){
            numbers [i] = random.nextInt(10);
        }
for ( int i = 0;  i < numbers.length; i ++){
    System.out.print(numbers[i] + " ");


}
        System.out.println();
        System.out.print(  " Длинна масива = " + numbers.length);
System.out.println( );
int count = 0 ;
 for (int i = 0; i < numbers.length; i++){
     if( numbers[i] > 8)
         count++;
 }
 System.out.println("Кол-во чисел > 8 = " + count);
        int count1 = 0 ;
        for (int i = 0; i < numbers.length; i++){
            if( numbers[i] == 1)
                count1++;
        }
        System.out.println("Кол-во чисел равных 1 = " +count1);

        int countE = 0 ;
        for (int i = 0; i < numbers.length; i++){
            if( numbers[i] % 2 == 0)
                countE++;
        }
        System.out.println("Кол-во четных  чисел   = " +countE);

        int countO = 0 ;
        for (int i = 0; i < numbers.length; i++){
            if( numbers[i] % 2 != 0)
                countO++;
        }
        System.out.println("Кол-во нечетных чисел  = " +countO);
        int sum = 0;
        for ( int i = 0 ; i < numbers.length; i ++){
            sum = sum +numbers[i];
        }
        System.out.println("Сумма всех элементов= " +sum);
}
    }




