package day11.task2;

import day11.task2.model.Hero;

public class Shaman extends Hero implements MagicAtt, Healer {
    static final int HEAL_AMOUNT = 50;

    static final int HEAL_TEAMMATE_AMOUNT = 30;
    int magickAttack = 15;

    public Shaman() {
        int magicAttack = 15;
        physDef = 0.5;
        magicDef = 0.2;
        psyAttack = 15;
        magickAttack = 15;
    }

    @Override
    public void PhysAtt(Hero hero) {

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
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAMMATE_AMOUNT > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEAL_TEAMMATE_AMOUNT;
        }

    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }

    @Override
    public void magicAttack(Hero hero) {
        double attackScore = magicAttack * (1 - hero.magicDef);
        if (hero.health - attackScore < 0) {
            hero.health = 0;
        } else {
            hero.health = (int) (hero.health - attackScore);
        }
    }
}
