package Homework_2.model.heroes;

import Homework_2.model.Enemy;
import Homework_2.model.utils.Randomizer;
import Homework_2.model.Hero;

// Mage - имеет шанс активировать магический щит от атак врагов
public class Mage extends Hero {
    public static final int DAMAGE = 25;
    public Mage(String name, int health){
        super(name, health, DAMAGE);
    }

    @Override
    public void attackEnemy(Enemy... enemy) {
        if (isAlive()) {
            super.attackEnemy(enemy);
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()){
            boolean flag = Randomizer.random(); // активирует ли маг щит
            if (flag)
                System.out.println(getName() + " активировал магический щит");
            else
                super.takeDamage(damage);
        }
    }
}
