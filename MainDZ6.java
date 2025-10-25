public class MainDZ6 {
    public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

System.out.println("Исходный массив:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = numbers[i] * 2;
    }

    System.out.println("\nИзмененный массив, у которого элементы увеличены в два раза: ");

    for (int number : numbers) {
        System.out.print(number + " ");
    }

}
}
