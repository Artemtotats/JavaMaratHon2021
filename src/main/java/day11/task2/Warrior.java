package day11.task2;

import day11.task2.model.Hero;

public class Warrior extends Hero {
    public Warrior() {
        physDef = 0.8;
        psyAttack = 30;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
