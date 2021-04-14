package day11.task2;

import day11.task2.model.Hero;

public class Magician extends Hero implements MagicAtt {
    int magicAttack=20;
    public Magician(){
        physDef=0;
        magicDef=0.8;
        psyAttack=5;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }

    @Override
    public void magicAttack(Hero hero) {
        double attackScore = magicAttack  * (1 - hero.magicDef);
        if (hero.health - attackScore < 0) {
            hero.health = 0;
        } else {
            hero.health = (int) (hero.health - attackScore);
        }

    }

}
