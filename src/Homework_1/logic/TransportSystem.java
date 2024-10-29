package Homework_1.logic;

import Homework_1.model.Stop;
import Homework_1.model.Transport;

public class TransportSystem {

    // транспорт сломан
    public void breakDown(Transport transport){
        if (transport.isWork()) {
            transport.setWork(false);
            System.out.println("Приносим свои извинения, " + transport.getType() + " № "
                    + transport.getID() + " сломался");
            if (transport.getReserve() != null){
                System.out.println("Не беспокойтесь, выехал резервный транспорт!");
            }
            else {
                System.out.println("К сожалению, " + transport.getType() + " прибудет через " + 40 + " минут");
            }
            System.out.println();
        }
    }

    // транспорт работоспособный
    public void repair(Transport transport){
        if (!transport.isWork()) {
            transport.setWork(true);
            System.out.println("Информируем: " + transport.getType() + " № "
                    + transport.getID() + " починили!");
            System.out.println();
        }
    }

    // показать маршрут данного транспорта
    public void showStop(Transport transport){
        System.out.println(transport.getType() + " № " + transport.getID());
        System.out.print("Маршрут: ");
        System.out.println(String.join(" -> ", transport.getStops()));
        System.out.println();
    }

    // показать какой транспорт останавливается на данной остановке
    public void showTransport(Stop stop){
        System.out.println("Остановка " + stop.getName() +": ");
        System.out.println(String.join(", ", stop.getTransports()));
        System.out.println();
    }

    // показать информацию о конкретном транспорте
    public void showInfoTransport(Transport transport){
        System.out.println(transport.toString());
    }


}
