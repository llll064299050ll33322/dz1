class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    public void stopEngine() {
        System.out.println("Двигатель остановлен");
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}


class ElectricCar extends Car {
  private int batteryCharge;

    public ElectricCar(String brand, String model, int year, int batteryCharge) {
        super(brand, model, year);
        this.batteryCharge = batteryCharge;
    }

    @Override
    public void startEngine() {
        System.out.println("Электродвигатель запущен");
    }

    @Override
    public void stopEngine() {
        System.out.println("Электродвигатель остановлен");
    }


    public int getBatteryCharge() {
        return batteryCharge;
    }


    public void setBatteryCharge(int batteryCharge) {
        if (batteryCharge >= 0 && batteryCharge <= 100) {
            this.batteryCharge = batteryCharge;
        } else {
            System.out.println("Недопустимый уровень заряда. Установите значение от 0 до 100.");
        }
    }


    public void checkBatteryCharge() {
        if (batteryCharge < 20) {
            System.out.println("Батарея разряжена, требуется зарядка");
        }
    }
}


public class MainDZ10 {
    public static void main(String[] args) {

        ElectricCar myElectricCar = new ElectricCar("Tesla", "Model 3", 2022, 85);

        myElectricCar.startEngine();
        myElectricCar.checkBatteryCharge(); // Проверка заряда (он выше 20%)


        myElectricCar.setBatteryCharge(15);
        myElectricCar.checkBatteryCharge();

        myElectricCar.stopEngine();


        System.out.println("Марка: " + myElectricCar.getBrand());
        System.out.println("Модель: " + myElectricCar.getModel());
        System.out.println("Год выпуска: " + myElectricCar.getYear());
        System.out.println("Уровень заряда: " + myElectricCar.getBatteryCharge() + "%");
    }

 {

        ElectricCar nullElectricCar = null;

        try {

            nullElectricCar.startEngine();
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Попытка вызвать метод на null-объекте.");
            System.out.println("Сообщение об ошибке: " + e.getMessage());

        }

        ElectricCar workingElectricCar = new ElectricCar("Nissan", "Leaf", 2021, 70);
        workingElectricCar.startEngine();
    }

}
