package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] x = new int[8][12];
        for (int i = 0; i < x.length; i++) {
            for (int j =0; j < x[i].length; j++) {
                x [i] [i]   = random.nextInt(50);
            }
        }
        int maxsum=0;
        int maxsumind=0;
   for (int i =0; i<x.length; i++){
            int sum = 0;
            for (int j =0; j<x[i].length; j++){
                  sum = sum + x[i][j];
            }
            if (sum >= maxsum){
           maxsum=sum;
           maxsumind=i;
        }
    }
   System.out.println(maxsumind);
}
}