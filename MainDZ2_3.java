import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class MainDZ2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите число: ");
                int number = scanner.nextInt();

                if (number < 0) {
                    throw new NegativeNumberException("Введено отрицательное число!");
                }

                System.out.println("Результат: " + (100 / number));
                break;

            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль невозможно! Попробуйте снова.");

            } catch (InputMismatchException e) {
                System.out.println("Введено нечисловое значение! Попробуйте снова.");
                scanner.nextLine();

            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage() + " Попробуйте снова.");
            }
        }

        scanner.close();
    }
}