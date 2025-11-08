public class MainDZ8 {

    //Задание 1

//    public static int multiplyNumbers(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println("5 * 10 = " + multiplyNumbers(5, 10));
//        System.out.println("-3 * 7 = " + multiplyNumbers(-3, 7));
//        System.out.println("50 * 100 = " + multiplyNumbers(50, 100));
//        System.out.println("-5 * -6 = " + multiplyNumbers(-5, -6));
//
//    }

    //Задание 2

//    public static int N_number(int n) {
//        if (n <= 0) {
//            return 0;
//        }
//        return n + N_number(n - 1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Сумма до 5: " + N_number(5));
//        System.out.println("Сумма до 10: " + N_number(10));
//        System.out.println("Сумма до 0: " + N_number(0));
//        System.out.println("Сумма до -5: " + N_number(-5));
//
//    }

    //Задание 3
//
//    public void ProductInfo(String productName) {
//        System.out.println("Название: " + productName);
//    }
//
//    public void ProductInfo(String productName, double price, int quantity) {
//        System.out.println("Название: " + productName + ", Цена: " + price + ", Количество: " + quantity);
//    }
//
//    public static void main(String[] args) {
//        MainDZ8 info = new MainDZ8();
//        info.ProductInfo("Ноутбук");
//        info.ProductInfo("Мышь");
//        System.out.println("- - - - - - - - - -  - - -");
//        info.ProductInfo("Ноутбук", 60000.00, 15);
//        info.ProductInfo("Мышь", 1200.50, 100);
//        info.ProductInfo("Клавиатура", 3500.00, 50);
//
//    }

    //Задание 4
//
//    public static int numbers(int number) {
//        if (number < 0) {
//            number = -number;
//        }
//
//        if (number == 0) {
//            return 0;
//        }
//        return (number % 10) + numbers(number / 10);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Сумма цифр 12345: " + numbers(12345));
//        System.out.println("Сумма цифр 987: " + numbers(987));
//        System.out.println("Сумма цифр 0: " + numbers(0));
//        System.out.println("Сумма цифр 10: " + numbers(10));
//        System.out.println("Сумма цифр -123: " + numbers(-123));
//    }

//    //Задание 5

    public static double calculatePerimeter(double sideLength) {
        if (sideLength <= 0) {
            System.out.println("Длина стороны квадрата должна быть положительной.");
            return -1;
        }
        return 4 * sideLength;
    }

    public static void main(String[] args) {
        System.out.println("Вычисление периметров квадратов со сторонами от 1 до 5:");
        for (int side = 1; side <= 5; side++) {
            double perimeter = calculatePerimeter(side);
            if (perimeter != -1) {
                System.out.println("Квадрат со стороной " + side + ": Периметр = " + perimeter);
            }
        }
    }

}