interface Transport {
    void move();
}

class Car3 implements Transport {
    @Override
    public void move() {
        System.out.println("Автомобиль едет по дороге");
    }
}


class Bike implements Transport {
    @Override
    public void move() {
        System.out.println("Велосипед едет по велодорожке");
    }
}

class TransportManager {
    public void startTransport(Transport transport) {
        System.out.print("Запуск транспорта: ");
        transport.move();
    }
}


public class MainDZ2_2 {
    public static void main(String[] args) {
        Transport car3 = new Car3();
        Transport bike = new Bike();
        TransportManager manager = new TransportManager();

        manager.startTransport(car3);
        manager.startTransport(bike);
    }
}
