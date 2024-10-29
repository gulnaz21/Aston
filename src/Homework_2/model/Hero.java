package Homework_2.model;

import Homework_2.model.utils.Mortal;

public abstract class Hero implements Mortal {
    private final String name;
    private int health;
    private final int damage;
    public Hero(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void attackEnemy(Enemy ... enemy){
        if (enemy.length == 1){
            if (enemy[0].isAlive())
                enemy[0].takeDamage(damage);
        }
        else {
            int random = (int) (Math.random() * enemy.length);
            if (enemy[random].isAlive()){
                enemy[random].takeDamage(damage);
            }
        }
    }
    public void takeDamage(int damage){
        health -= damage;
        if (!isAlive()){
            System.out.println(name + " убит!");
        }
    }
}
