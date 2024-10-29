package Homework_2.model.heroes;

import Homework_2.model.utils.Randomizer;
import Homework_2.model.Enemy;
import Homework_2.model.Hero;

// Warrior - имеет шанс активировать дополнительный урон
public class Warrior extends Hero {
    public static final int DAMAGE = 20;
    public Warrior(String name, int health){
        super(name, health, DAMAGE);
    }

    @Override
    public void attackEnemy(Enemy ... enemy) {
        if (isAlive()) {
            boolean flag = Randomizer.random(); // активирует ли воин доп. урон
            if (flag) {
                int random = (int) (Math.random() * enemy.length);
                if (enemy[random].isAlive()) {
                    System.out.println(getName() + " активировал доп. урон");
                    enemy[random].takeDamage(DAMAGE + DAMAGE);
                }
            }
            else super.attackEnemy(enemy);
        }
    }
}
