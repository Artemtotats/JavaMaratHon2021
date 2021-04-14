package day11.task2;

import day11.task2.model.Hero;

public class Paladin extends Hero implements Healer {
    static final int HEAL_AMOUNT = 25;

    static final int HEAL_TEAMMATE_AMOUNT = 20;

    public Paladin() {
        psyAttack = 0.5;
        magicDef = 0.2;
        psyAttack = 15;
    }

    @Override
    public void healHimself() {
        health += HEAL_AMOUNT;
        if (health + HEAL_AMOUNT > MAX_HEALTH) {
            health = MAX_HEALTH;

        } else {
            health -= HEAL_AMOUNT;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAMMATE_AMOUNT > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEAL_TEAMMATE_AMOUNT;
        }
    }
}
