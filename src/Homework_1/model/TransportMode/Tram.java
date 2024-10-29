package Homework_1.model.TransportMode;

import Homework_1.model.Transport;

public class Tram extends Transport {
    int number_of_cars; // количество вагонов
    private static final String TYPE = "трамвай";

    public Tram(int ID, int interval, int capacity, int cost, int number_of_cars){
        super(ID, interval, capacity, TYPE, cost);
        this.number_of_cars = number_of_cars;
    }
    public Tram(Tram tram){
        super(tram);
    }

    // присоединить вагон
    public void attach_car(){
        number_of_cars++;
    }

    // отсоединить вагон
    public void detach_car(){
        number_of_cars--;
    }


}
