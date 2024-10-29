package Homework_2.model.enemies;

import Homework_2.model.Enemy;
import Homework_2.model.Hero;
import Homework_2.model.utils.Randomizer;

// Zombie - имеет шанс воскреснуть при гибели
public class Zombie extends Enemy {
    public static final int DAMAGE = 10;
    private static final String TYPE = "Зомби";
    private final int maxHealth;
    public Zombie(int health){
        super(health, DAMAGE, TYPE);
        maxHealth = health;
    }

    @Override
    public void attackHero(Hero... hero) {
        if (isAlive()) {
            super.attackHero(hero);
        }
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if (!isAlive()) {
            boolean flag = Randomizer.random();
            if (flag) {
                setHealth(maxHealth);
                System.out.println("Зомби воскрешен");
            }
        }
    }

}
