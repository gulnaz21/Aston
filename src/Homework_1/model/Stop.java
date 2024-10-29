package Homework_1.model;

import java.util.ArrayList;
import java.util.List;

// Класс для создания остановки
public class Stop {
    private String name;
    private final List<String> transports;
    public Stop(String name){
        this.name = name;
        transports = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTransports() {
        return transports;
    }

    public void setTransports(String transport) {
        transports.add(transport);
    }
}
