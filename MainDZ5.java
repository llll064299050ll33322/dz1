public class MainDZ5 {
    public static void main(String[] args) {


//        Задание 1
//        int[] numbers = {10, 20, 30, 40, 50};
//        int sum = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//
//         int average = sum / numbers.length;
//
//        System.out.println("Среднее значение элементов массива: " + average);


//        Задание 2
//        int[] numbers = {1, -2, 3, -4, 5, -6};
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < 0) {
//                numbers[i] = numbers[i] = -numbers[i];
//            }
//        }
//        System.out.println("Массив после замены отрицательных на абсолютные: " + Arrays.toString(numbers));


//        Задание 3
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        System.out.println("\nСумма элементов каждой строки:");
//
//        for (int i = 0; i < matrix.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < matrix[i].length; j++) {
//                sum += matrix[i][j];
//            }
//            System.out.println("Строка " + i + ": " + sum);
//        }


//        Задание 4
//        int[] numbers = {6, 11, 53, 44, 39, 25};
//
//        int Index = 0;
//        int maxElement = numbers[0];
//
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > maxElement) {
//                maxElement = numbers[i];
//                Index = i;
//            }
//        }
//
//        System.out.println("Индекс максимального элемента: " + Index + " и его максимальный элемент: " + maxElement );



 //        Задание 5
        int[] numbers = {1, 2, 3, 4, 5, 5};
        boolean duplicate = false;


        for (int i = 0; i < numbers.length; i++) {
            for (int j = i ++; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicate = true;
                    break;
                }
            }
        }

        if (duplicate) {
            System.out.println("В массиве есть повторяющиеся элементы.");
        } else {
            System.out.println("Повторяющихся элементов нет.");
        }

    }
}
