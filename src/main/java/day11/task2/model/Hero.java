package day11.task2.model;

import day11.task2.PhysAtt;

public abstract class Hero implements PhysAtt {
    public static final int MAX_HEALTH = 100;
    public int health;
    public double psyAttack;
    public double physDef;
    public double magicDef;
    public int magicAttack;

    public Hero() {
        health = 100;
    }

    public void PhysAtt(Hero hero) {
        double attackScore = psyAttack * (1 - hero.physDef);
        if (hero.health - attackScore < 0) {
            hero.health = 0;
        } else {
            hero.health = (int) (hero.health - attackScore);
        }
    }
}
