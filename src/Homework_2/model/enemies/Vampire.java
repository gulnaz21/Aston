package Homework_2.model.enemies;

import Homework_2.model.utils.Randomizer;
import Homework_2.model.Enemy;
import Homework_2.model.Hero;

// Vampire - имеет шанс восстанавливать здоровье, нанося урон противникам
// (восстанавливает здоровье = нанесенному урону)
public class Vampire extends Enemy {
    public static final int DAMAGE = 10;
    private static final String TYPE = "Вампир";
    public Vampire(int health){
        super(health, DAMAGE, TYPE);
    }

    @Override
    public void attackHero(Hero ... hero) {
        if (isAlive()) {
            super.attackHero(hero);
            boolean flag = Randomizer.random(); // восстановит ли вампир здоровье
            if (flag) {
                System.out.println("Вампир восстанавливает здоровье");
                setHealth(getHealth() + DAMAGE);
            }
        }
    }
}
