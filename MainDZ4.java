

public class MainDZ4 {



    public static void main(String[] args) {
//        Задание 1
//        int number = 1;
//        System.out.println("Четные числа от 1 до 50:");
//
//        while (number <= 50) {
//            if (number % 2 == 0) {
//                System.out.println(number);
//            }
//            number++;
//        }

//       Задание 2
//        int number = 1;
//        int number2 = 0;
//
//        do {
//            if (number % 7 == 0) {
//                number2++;
//            }
//            number++;
//        } while (number <= 100);
//
//        System.out.println("Количество чисел, которые делятся на 7: " + number2);


//      Задание 3
//        int number = 1;
//        int sum = 0;
//
//        while (number <= 100) {
//            sum += number;
//            number++;
//        }
//        System.out.println("Сумма всех чисел от 1 до 100: " + sum);

//      Задание 4
        int min = 1;
        int max = 20;
        int endNumber = 15;
        int generatedNumber;
        int attempts = 0;

        System.out.println("Генерация случайных чисел от " + min + " до " + max + ", пока не встретилось с " + endNumber + ":");

        do {
            generatedNumber = (int) (Math.random() * 20);

            System.out.println("Сгенерировано: " + generatedNumber);
            attempts++;

        } while (generatedNumber != endNumber);

        System.out.println("Число " + endNumber + " было сгенерировано после " + attempts + " попыток.");
    }
}
