package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
        String city = scanner.nextLine();
            if(city.equals("Stop"))
                break;


            switch (city){
            case "Москва":
            case "Владивосток":
            case "Ростов":
                System.out.print("Россия");
break;

            case "Рим":
            case "Милан":
            case "Турин":
                System.out.print("Италия");
break;

            case  "Ливерпуль":
            case "Манчестер":
            case "Лондон":
                System.out.print("Англия");
break;


            case  "Берлин":
            case "Мюнхен":
            case "Кельн":
                System.out.print("Германия");
                break;
               default:
                   System.out.print("Неизвестная страна");


    }

}
}
}