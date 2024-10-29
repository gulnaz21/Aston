package Homework_2.model;

import Homework_2.model.utils.Mortal;

public abstract class Enemy implements Mortal {
    private int health;
    private final int DAMAGE;
    private final String TYPE;
    public Enemy(int health, int damage, String type){
        this.health = health;
        this.DAMAGE = damage;
        this.TYPE = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public void takeDamage(int damage){
        health -= damage;
        if (!isAlive())
            System.out.println(TYPE + " мертв!");
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void attackHero(Hero ... hero){
        if (hero.length == 1){
            if (hero[0].isAlive())
                hero[0].takeDamage(DAMAGE);
        }
        else {
            int random = (int) (Math.random() * hero.length);
            if (hero[random].isAlive())
                hero[random].takeDamage(DAMAGE);
        }
    }
}
