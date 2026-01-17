import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class MainDZ2_6 {

    // Класс для 3 задания
    static class GuestList {
        private HashSet<String> guests;

        public GuestList() {
            guests = new HashSet<>();
        }

        public void addGuest(String name) {
            guests.add(name);
        }

        public boolean checkGuest(String name) {
            return guests.contains(name);
        }

        public void showAllGuests() {
            System.out.println("Список гостей:");
            for (String guest : guests) {
                System.out.println("- " + guest);
            }
        }
    }


    public static void main(String[] args) {

// 1 Задание
//        HashSet<String> users = new HashSet<>();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Выберите: ");
//            System.out.println("\n1. Добавить пользователя");
//            System.out.println("2. Проверить пользователя");
//            System.out.println("3. Показать всех пользователей");
//            System.out.println("4. Выйти");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            if (choice == 1) {
//                System.out.print("Введите имя: ");
//                String name = scanner.nextLine();
//                users.add(name);
//                System.out.println("Добавлено!");
//            }
//            else if (choice == 2) {
//                System.out.print("Введите имя для проверки: ");
//                String name = scanner.nextLine();
//                if (users.contains(name)) {
//                    System.out.println("Есть такой пользователь");
//                } else {
//                    System.out.println("Нет такого пользователя");
//                }
//            }
//            else if (choice == 3) {
//                System.out.println("Все пользователи:");
//                for (String user : users) {
//                    System.out.println(user);
//                }
//            }
//            else if (choice == 4) {
//                break;
//            }
//        }
//        scanner.close();

        // 2 Задание
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите текст:");
//        String text = scanner.nextLine();
//
//        String[] words = text.toLowerCase().split("[^a-zA-Zа-яА-Я]+");
//
//        TreeSet<String> uniqueWords = new TreeSet<>();
//
//        for (String word : words) {
//            if (!word.isEmpty()) {
//                uniqueWords.add(word);
//            }
//        }
//
//        System.out.println("\nУникальные слова по алфавиту:");
//        for (String word : uniqueWords) {
//            System.out.println(word);
//        }
//
//        scanner.close();


        // 3 Задание

        GuestList guestList = new GuestList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имена гостей (для окончания введите 'стоп'):");

        while (true) {
            System.out.print("Имя гостя: ");
            String name = scanner.nextLine();

            if (name.equals("стоп")) {
                break;
            }

            guestList.addGuest(name);
        }
        guestList.showAllGuests();

        System.out.print("\nПроверить гостя: ");
        String checkName = scanner.nextLine();
        if (guestList.checkGuest(checkName)) {
            System.out.println("Гость есть в списке");
        } else {
            System.out.println("Гостя нет в списке");
        }

        scanner.close();
    }
}
