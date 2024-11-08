package Homework_1;

import Homework_1.logic.*;
import Homework_1.model.Employee;
import Homework_1.model.Employees.*;
import Homework_1.model.Stop;
import Homework_1.model.Transport;
import Homework_1.model.TransportMode.*;

/** Система Городской транспорт.
На Маршрут назначаются Автобус, Троллейбус или Трамвай.
Транспортные средства должны двигаться с определенным для каждого Маршрута интервалом.
При поломке на Маршрут должен выходить резервный транспорт или увеличиваться интервал движения. */

public class AppRunner {

    public static void main(String[] args) {

        // создаем остановки
        Stop stop1 = new Stop("Ж/д вокзал");
        Stop stop2 = new Stop("Колхозный рынок");
        Stop stop3 = new Stop("Габдуллы Тукая");
        Stop stop4 = new Stop("Театр им. Камала");
        Stop stop5 = new Stop("Театр им. Тинчурина");

        // создаем транспорт
        Bus bus1 = new Bus(10, 10, 29, true, 3, 45);
        Bus bus2 = new Bus(bus1);

      //  bus1.addReserve(bus2);
        Tram tram = new Tram(1, 15, 50, 45, 2);
        Trolleybus trolleybus = new Trolleybus(5, 10, 29, 45);

        // создаем персонал
        Driver driver1 = new Driver(1, "Иван", bus1);
        Conductor conductor1 = new Conductor(2, "Ольга", bus1);

        Driver driver2 = new Driver(3, "Рамис", bus2);
        Conductor conductor2 = new Conductor(4, "Азалия", bus2);


        // создаем маршрут транспорта
        bus1.addStop(stop1, stop2, new Stop("Худякова"), stop3, new Stop("Станция метро пл. Тукая"));
        bus2.addStop(stop5, stop4, stop3, stop2, stop1);
        tram.addStop(stop1, stop4, stop5);
        trolleybus.addStop(stop5, stop4, stop1);

        TransportSystem transportSystem = new TransportSystem();

        transportSystem.showInfoTransport(bus1);
        transportSystem.breakDown(bus2);
        transportSystem.showStop(trolleybus);
        transportSystem.breakDown(tram);
        transportSystem.repair(bus2);
        transportSystem.showTransport(stop1);
    }
}