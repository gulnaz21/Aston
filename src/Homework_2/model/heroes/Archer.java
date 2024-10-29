package Homework_2.model.heroes;

import Homework_2.model.utils.Randomizer;
import Homework_2.model.Enemy;
import Homework_2.model.Hero;

// Archer - имеет шанс запустить стрелу с бомбой, которая наносит урон всем противникам в радиусе
public class Archer extends Hero {
    public static final int DAMAGE = 15;
    public Archer(String name, int health){
        super(name, health, DAMAGE);
    }

    @Override
    public void attackEnemy(Enemy ... enemy) {
        if (isAlive()) {
            boolean flag = Randomizer.random(); // активирует ли лучник стрелу с бомбой

            if (flag) {
                System.out.println(getName() + " активировал стрелу с бомбой");
                for (Enemy e : enemy) {
                    super.attackEnemy(e);
                }
            } else
                super.attackEnemy(enemy);
        }
    }
}
