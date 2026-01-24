import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class MainDZ2_7 {


    // Для 2 задания
    public static List<String> filterStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("\n1 задание");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 3)
                .collect(Collectors.toList());

        System.out.println("Исходный список: " + numbers);
        System.out.println("Результат: " + result);


        System.out.println("\n2 задание");
        List<String> strings = List.of("кот", "собака", "лев", "лось", "осьминог", "жук");

        List<String> result2 = filterStrings(strings);

        System.out.println("Исходный список: " + strings);
        System.out.println("Строки длиной > 5: " + result2);

        System.out.println("\n3 задание");
        List<String> names = List.of("Анна", "Иван","Ольга", "Олег", "Светлана", "Петр");

        List<String> reversedNames = IntStream.range(0, names.size())
                .mapToObj(i -> names.get(names.size() - 1 - i))
                .collect(Collectors.toList());

        System.out.println("Исходный список: " + names);
        System.out.println("В обратном порядке: " + reversedNames);

    }
}
