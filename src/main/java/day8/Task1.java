package day8;

public class Task1 {
    public static void main(String[] args) {

        String nambers = "";
        long before = System.currentTimeMillis();
        for (int i = 0; i <= 2000; i++) {
            nambers += i + " ";
        }
        long after = System.currentTimeMillis();
        System.out.println(nambers);
        System.out.println("Время выполнения цикла в String :" + (after - before));


        long before1 = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= 2000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        long after1 = System.currentTimeMillis();
        System.out.println("Время выполнения цикла в StringBulder :" + (after1 - before1));

    }
}
