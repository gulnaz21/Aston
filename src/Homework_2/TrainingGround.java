package Homework_2;

import Homework_2.model.Hero;
import Homework_2.model.enemies.Dragon;
import Homework_2.model.enemies.Vampire;
import Homework_2.model.enemies.Zombie;
import Homework_2.model.heroes.Archer;
import Homework_2.model.heroes.Mage;
import Homework_2.model.heroes.Warrior;

// Тренировочная площадка для героев
public class TrainingGround {
    public static void main(String[] args) {

        Hero warrior = new Warrior("Warrior", 100);
        warrior.attackEnemy(new Dragon(100));

        Hero mage = new Mage("Mage", 100);
        mage.attackEnemy(new Zombie(45));

        Hero archer = new Archer("Archer", 100);
        archer.attackEnemy(new Vampire(110));

    }
}
