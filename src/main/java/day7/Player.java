package day7;

import java.util.Random;

public class Player {


    private int stamina;

    static private int countPlayers;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;


    Random random = new Random();
    int i = random.nextInt(10 + 1) + 90;

    public void setStamina(int stamina) {
        this.stamina = i;
    }

    public Player(int i) {


        if (i > MAX_STAMINA) {
            System.out.println("Неверные данные выносливость должна быть меньше 100" + " " + stamina);

        }
        if (i < MIN_STAMINA) {
            System.out.println("Неверные данные выносливость должна быть  больше 0");

        }

        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {

        if (i == 0)
            return;
        stamina--;
        if (i== 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команда не полная " + (6 - countPlayers) + " " + "свободных мест");
        } else {
            System.out.println("Мест в командах больше нет");
        }
    }
}


