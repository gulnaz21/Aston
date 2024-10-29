package Homework_2.model.enemies;

import Homework_2.model.utils.Randomizer;
import Homework_2.model.Enemy;
import Homework_2.model.Hero;

// Dragon - имеет шанс наносить урон всем противникам
public class Dragon extends Enemy {

    private static final int DAMAGE = 30;
    private static final String TYPE = "Дракон";
    public Dragon(int health){
        super(health, DAMAGE, TYPE);
    }

    @Override
    public void attackHero(Hero ... hero) {
        if (isAlive()) {
            boolean flag = Randomizer.random();
            if (flag) {
                System.out.println("Дракон наносит урон всем противникам в радиусе");
                for (Hero h : hero) {
                    super.attackHero(h);
                }
            } else
                super.attackHero(hero);
        }
    }
}
