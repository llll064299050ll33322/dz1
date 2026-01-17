import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main2_7 {
    public static void main(String[] args) {
//        int[] numbers = {5,4,3,2,1,1,2,3,4,5};
        int[] numbers = {5, 4, 3, 2, 1};

        for (int number : numbers) {
//            if(number % 2 == 0){
            if (isEven(number)) {
                System.out.println(number);
            }
        }
        Arrays.stream(numbers)
                .filter(Main2_7::isEven)
                .forEach(number-> System.out.println(number));
//                .forEach(System.out.println);


    }

        public static boolean isEven(int number){
            return number % 2 == 0;
        }

//        IntStream numberStream = Arrays.stream(numbers);
//        System.out.println(numberStream.count());

//        boolean condition = numberStream.allMatch(number -> number < 10);
//        boolean condition = numberStream.anyMatch(number -> number == 5);
//        boolean condition = numberStream.noneMatch(number -> number < 0);
//        System.out.println(condition);

//        int[] uniqueNumbers = Arrays.stream(numbers)
//                .distinct()
//                .toArray();


//        Arrays.stream(numbers)
//                .filter(number -> number % 2 == 0)
//                .sorted()
//                .map(number -> number * 2)
//                .limit(3)
//                .distinct()
//                .forEach(number -> System.out.println(number));
//                .collect(Collectors.toList())
//                .toArray();
    }

