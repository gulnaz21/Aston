package Homework_1.model.TransportMode;

import Homework_1.model.Transport;

public class Trolleybus extends Transport {
    private static final String TYPE = "троллейбус";
    public Trolleybus(int ID, int interval, int capacity, int cost){
        super(ID, interval, capacity, TYPE, cost);
    }
    public Trolleybus(Trolleybus trolleybus){
        super(trolleybus);
    }
}
