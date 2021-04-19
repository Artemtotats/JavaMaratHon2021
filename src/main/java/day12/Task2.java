package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        List<Integer> list1 = new ArrayList<>();
        for (int y = 300; y <= 350; y++) {
            if (y % 2 == 0) {
                list1.add(y);
            }
        }
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.addAll(list1);
        System.out.println(list2);
    }
}
