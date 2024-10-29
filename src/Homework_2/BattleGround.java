package Homework_2;

import Homework_2.model.enemies.Dragon;
import Homework_2.model.Enemy;
import Homework_2.model.Hero;
import Homework_2.model.enemies.Vampire;
import Homework_2.model.enemies.Zombie;
import Homework_2.model.heroes.Archer;
import Homework_2.model.heroes.Mage;
import Homework_2.model.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {

        Hero mage = new Mage("Маг", 130);
        Hero warrior = new Warrior("Воин", 150);
        Hero archer = new Archer("Лучник", 100);

        Enemy zombie = new Zombie(50);
        Enemy vampire = new Vampire(120);
        Enemy dragon = new Dragon(160);


        for (int i = 1; i < 3; i++){
            System.out.println("Раунд " + i);
            while ((mage.isAlive() || warrior.isAlive() || archer.isAlive())
                && (zombie.isAlive() || vampire.isAlive() || dragon.isAlive())){
                mage.attackEnemy(zombie, vampire, dragon);
                zombie.attackHero(mage, warrior, archer);
                warrior.attackEnemy(zombie, vampire, dragon);
                vampire.attackHero(mage, warrior, archer);
                archer.attackEnemy(zombie, vampire, dragon);
                dragon.attackHero(mage, warrior, archer);
            }
            mage.setHealth(130);
            zombie.setHealth(50);
            warrior.setHealth(150);
            vampire.setHealth(120);
            archer.setHealth(100);
            dragon.setHealth(160);
            System.out.println();
        }
    }
}
