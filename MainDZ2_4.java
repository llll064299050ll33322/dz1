import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;


//        Задание 1
//public class MainDZ2_4 {
//    public static void main(String[] args) {
//        ArrayList<String> shoppingList = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        shoppingList.add("хлеб");
//        shoppingList.add("молоко");
//        shoppingList.add("яйца");
//
//        System.out.println("Текущий список: " + shoppingList);
//
//        System.out.print("Введите товар для добавления: ");
//        String newItem = scanner.nextLine();
//        shoppingList.add(newItem);
//        System.out.println("После добавления: " + shoppingList);
//
//
//        System.out.print("Введите товар для удаления: ");
//        String removeItem = scanner.nextLine();
//        if (shoppingList.remove(removeItem)) {
//            System.out.println("Товар удален. Список: " + shoppingList);
//        } else {
//            System.out.println("Товар не найден.");
//        }
//
//        System.out.print("Введите товар для поиска: ");
//        String searchItem = scanner.nextLine();
//        int index = shoppingList.indexOf(searchItem);
//        if (index != -1) {
//            System.out.println("Товар найден на позиции: " + (index + 1));
//        } else {
//            System.out.println("Товар не найден.");
//        }
//
//        scanner.close();
//
//    }
//}


//        Задание 2
//public class MainDZ2_4 {
//    public static void main(String[] args) {
//        ArrayList<String> tasks = new ArrayList<>();
//        ArrayList<Integer> priorities = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//
//        tasks.add("Помыть посуду");
//        priorities.add(2);
//        tasks.add("Купить продукты");
//        priorities.add(1);
//        tasks.add("Заправить кровать");
//        priorities.add(3);
//
//        System.out.println("Задачи до сортировки:");
//        for (int i = 0; i < tasks.size(); i++) {
//            System.out.println(priorities.get(i) + ": " + tasks.get(i));
//        }
//
//        System.out.print("Введите новую задачу: ");
//        String newTask = scanner.nextLine();
//        System.out.print("Введите приоритет (1-высокий, 2-средний, 3-низкий): ");
//        int priority = scanner.nextInt();
//        scanner.nextLine();
//
//        tasks.add(newTask);
//        priorities.add(priority);
//
//        ArrayList<Integer> sortedIndices = new ArrayList<>();
//        for (int i = 0; i < tasks.size(); i++) sortedIndices.add(i);
//
//        Collections.sort(sortedIndices, (a, b) -> priorities.get(a) - priorities.get(b));
//
//        System.out.println("\nЗадачи после сортировки:");
//        for (int i = 0; i < sortedIndices.size(); i++) {
//            int idx = sortedIndices.get(i);
//            System.out.println(priorities.get(idx) + ": " + tasks.get(idx));
//        }
//
//        System.out.print("\nВведите номер задачи для удаления: ");
//        int removeIndex = scanner.nextInt();
//        if (removeIndex >= 1 && removeIndex <= tasks.size()) {
//            tasks.remove(removeIndex - 1);
//            priorities.remove(removeIndex - 1);
//            System.out.println("Задача удалена.");
//        }
//
//        scanner.close();

//    }
//}


//        Задание 3
public class MainDZ2_4  {

    public static List<Integer> getUniqueSorted(List<Integer> input) {
        List<Integer> result = new ArrayList<>();

        for (Integer num : input) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);

        System.out.println("Исходный список: " + numbers);

        List<Integer> uniqueSorted = getUniqueSorted(numbers);
        System.out.println("Уникальные отсортированные: " + uniqueSorted);
    }
}



