package Homework_1.model.TransportMode;

import Homework_1.model.Transport;

public class Bus extends Transport {
    private final boolean wheelchair; // доступность для инвалидов
    private final int number_of_doors; // количество дверей
    private static final String TYPE = "автобус";
    public Bus(int ID, int interval, int capacity, boolean wheelchair, int number_of_doors, int cost){
        super(ID, interval, capacity, TYPE, cost);
        this.wheelchair = wheelchair;
        this.number_of_doors = number_of_doors;
    }

    public Bus(Bus bus){
        super(bus);
        this.wheelchair = bus.isWheelchair();
        this.number_of_doors = bus.getNumber_of_doors();
    }

    public boolean isWheelchair() {
        return wheelchair;
    }

    public int getNumber_of_doors() {
        return number_of_doors;
    }

}
