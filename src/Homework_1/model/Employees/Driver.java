package Homework_1.model.Employees;

import Homework_1.model.Employee;
import Homework_1.model.Transport;

public class Driver extends Employee {
    private static final String TYPE = "водитель";
    public Driver(int ID, String name, Transport transport){
        super(ID, name, transport, TYPE);
    }
}
