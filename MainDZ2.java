public class MainDZ2 {
    public static void main(String[] args) {

//        Задание 1
//        int age = 20;
//
//
//        if (age >= 2 && age <= 6) {
//            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
//        } else if (age >= 7 && age <= 17) {
//            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
//        } else if (age >= 18 && age <= 24) {
//            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
//        } else if (age > 24) {
//            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
//        } else {
//            System.out.println("Для возраста " + age + " нет подходящего ответа.");
//        }

//        Задание 2
//        int all = 102;
//        int seats = 60;
//        int other = all - seats;
//
//        int passengers = 75;
//
//        System.out.println("Проверка вагона: " + passengers + " пассажира.");
//
//        if (passengers < 0) {
//            System.out.println("Количество пассажиров не может быть отрицательным.");
//        } else if (passengers < seats) {
//            System.out.println("Есть место в вагоне, и оно сидячее.");
//        } else if (passengers < all) {
//            System.out.println("Есть место в вагоне, но оно стоячее.");
//        } else if (passengers == all) {
//            System.out.println("Вагон полностью заполнен.");
//        } else {
//            System.out.println("В вагоне больше пассажиров, чем его вместимость. Вагон переполнен!");
//        }

//
//        Задание 3
//        int year = 2025;
//
//        System.out.println("Проверка года: " + year);
//
//        if (year <= 1584) {
//            System.out.println("Год должен быть больше 1584.");
//        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println(year + " год является високосным.");
//        } else {
//            System.out.println(year + " год не является високосным.");
//        }
//

//                Задание 4
                int monthNumber = 12;

                System.out.println("Проверка месяца: " + monthNumber);

                if (monthNumber > 12 || monthNumber < 1) {
                    System.out.println("Неверно. Введите число от 1 до 12.");
                } else {
                    String season;

                    switch (monthNumber) {
                        case 12:
                        case 1:
                        case 2:
                            season = "Зима";
                            break;
                        case 3:
                        case 4:
                        case 5:
                            season = "Весна";
                            break;
                        case 6:
                        case 7:
                        case 8:
                            season = "Лето";
                            break;
                        case 9:
                        case 10:
                        case 11:
                            season = "Осень";
                            break;
                        default:
                            season = "Неверно";
                    }
                    System.out.println("Месяц " + monthNumber + " сезон " + season );
                }



}
}
