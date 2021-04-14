package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Shaman shaman = new Shaman();
        Magician magician = new Magician();

        warrior.PhysAtt(paladin);
        System.out.println(paladin);

        paladin.PhysAtt(magician);
        System.out.println(magician);

        shaman.healTeammate(magician);
        System.out.println(magician);

        magician.magicAttack(warrior);
        System.out.println(warrior);

        shaman.PhysAtt(warrior);
        System.out.println(warrior);

        paladin.healHimself();
        System.out.println();

        for (int i = 0; i < 5; i++){
            warrior.PhysAtt(magician);
            System.out.println(magician);
        }


    }
}
