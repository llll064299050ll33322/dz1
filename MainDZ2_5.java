import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MainDZ2_5  {
    public static void main(String[] args) {

        System.out.println("1 задание: ");

        HashMap<String, Boolean> library = new HashMap<>();

        library.put("Война и мир", true);
        library.put("Преступление и наказание", true);
        library.put("Мастер и Маргарита", false); // уже выдана
        library.put("Евгений Онегин", true);

        System.out.println("\nВыдача книги");
        String bookToBorrow = "Война и мир";
        if (library.containsKey(bookToBorrow) && library.get(bookToBorrow)) {
            library.put(bookToBorrow, false);
            System.out.println("Книга - " + bookToBorrow + " выдана");
        } else {
            System.out.println("Книга - " + bookToBorrow + " не доступна");
        }

        System.out.println("\nВозврат книги");
        String bookToReturn = "Мастер и Маргарита";
        if (library.containsKey(bookToReturn) && !library.get(bookToReturn)) {
            library.put(bookToReturn, true);
            System.out.println("Книга - " + bookToReturn + " возвращена");
        }

        System.out.println("\nВсе книги в библиотеке");
        for (Map.Entry<String, Boolean> entry : library.entrySet()) {
            String status = entry.getValue() ? "доступна" : "выдана";
            System.out.println(entry.getKey() + " - " + status);
        }



        System.out.println("\n2 задание: ");

        LinkedHashMap<String, String> contacts = new LinkedHashMap<>();

        contacts.put("Иван", "555-1111");
        contacts.put("Анна", "555-2222");
        contacts.put("Петр", "555-3333");
        contacts.put("Лариса", "555-4444");

        System.out.println("\nПоиск по имени:");
        String searchName = "Анна";
        if (contacts.containsKey(searchName)) {
            System.out.println(searchName + ": " + contacts.get(searchName));
        } else {
            System.out.println("Контакт не найден");
        }

        System.out.println("\nПоиск по части имени (содержит букву р): ");
        for (String name : contacts.keySet()) {
            if (name.toLowerCase().contains("р")) {
                System.out.println(name + ": " + contacts.get(name));
            }
        }

        System.out.println("\nВсе контакты: ");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }



        System.out.println("\n3 задание: ");

        TreeMap<String, Integer> students = new TreeMap<>();

        students.put("Иванов", 4);
        students.put("Петрова", 5);
        students.put("Сидорова", 3);
        students.put("Алексеев", 4);
        students.put("Васильев", 5);
        students.put("Кузнецова", 5);

        System.out.println("\nСписок студентов по алфавиту: ");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nОтличники: ");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > 4) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        System.out.println("\nПервый и последний студенты: ");
        if (!students.isEmpty()) {
            System.out.println("Первый: " + students.firstKey());
            System.out.println("Последний: " + students.lastKey());
        }
    }
}
