package Homework_1.model;

// Абстрактный класс по созданию работника в общественном транспорте
public abstract class Employee {
    private final int ID;
    private final String name;
    private final Transport transport;
    private final String type;
    public Employee(int ID, String name, Transport transport, String type){
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.transport = transport;
        transport.addEmployee(name + " - " + type);
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public Transport getTransport(){
        return transport;
    }
}
