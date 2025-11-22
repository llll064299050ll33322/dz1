// Анемичная модель
class CarData {
    private String brand;
    private String model;
    private int year;

    public CarData(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
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


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


class CarService {
    public void printCarInfo(CarData carData) {
        System.out.println("Информация об автомобиле (класса CarData): ");
        System.out.println("Марка: " + carData.getBrand());
        System.out.println("Модель: " + carData.getModel());
        System.out.println("Год выпуска: " + carData.getYear());
    }


}

// Объектно-ориентированная модель
class FunctionalCar {
    private String brand;
    private String model;
    private int year;
    private boolean engineRunning;

    public FunctionalCar(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineRunning = false;
    }


    public void startAndPrintInfo() {
        startEngine();
        printInfo();
    }


    private void startEngine() {
        if (!engineRunning) {
            System.out.println("FunctionalCar: Двигатель " + brand + " " + model + " запущен.");
            engineRunning = true;
        } else {
            System.out.println("FunctionalCar: Двигатель " + brand + " " + model + " уже запущен.");
        }
    }

    public void stopEngine() {
        if (engineRunning) {
            System.out.println("FunctionalCar: Двигатель " + brand + " " + model + " остановлен.");
            engineRunning = false;
        } else {
            System.out.println("FunctionalCar: Двигатель " + brand + " " + model + " уже остановлен.");
        }
    }

    public void printInfo() {
        System.out.println("--- Информация об автомобиле (FunctionalCar) ---");
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Двигатель работает: " + (engineRunning ? "Да" : "Нет"));
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

    public boolean isEngineRunning() {
        return engineRunning;
    }
}

public class differencesDZ10 {
    public static void main(String[] args) {
        System.out.println("Демонстрация анемичной модели (классов CarData + CarService): ");


        CarData myCarData = new CarData("Toyota", "Camry", 2020);
        CarService carService = new CarService();
        carService.printCarInfo(myCarData);



        System.out.println("\nДемонстрация объектно-ориентированной модели (класса FunctionalCar): ");


        FunctionalCar myFunctionalCar = new FunctionalCar("Ford", "Mustang", 2023);


        myFunctionalCar.printInfo();
        myFunctionalCar.startAndPrintInfo();
        myFunctionalCar.printInfo();
        myFunctionalCar.stopEngine();
        myFunctionalCar.printInfo();

        System.out.println("\nСравнение удобства ");

        System.out.println("С анемичной моделью:");
        System.out.println(" - Данные и логика разделены.");
        System.out.println(" - Может быть сложнее понять, где находится конкретная логика, связанная с данными.");
        System.out.println(" - Изменение состояния требует явных вызовов сеттеров или методов сервиса.");

        System.out.println("\nС объектно-ориентированной моделью:");
        System.out.println(" - Данные и логика инкапсулированы вместе.");
        System.out.println(" - Код выглядит более читаемым и понятным.");
        System.out.println(" - Проще управлять состоянием и сложным поведением, так как вся связанная логика находится внутри класса.");
    }
}
