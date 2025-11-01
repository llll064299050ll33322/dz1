public class MainDZ7 {
    public static void main(String[] args) {
//       Задание 1

        String text = "Программирование на Java это интересно!";

        int length = text.length();

        char firstChar = text.charAt(0);
        boolean haveJava = text.indexOf("Java") != -1;
        String javaStatus = haveJava ? "да" : "нет";

        System.out.println("Длина строки: " + length + ". Первый символ: " + firstChar + ". Содержит Java: " + javaStatus + ".");


//       Задание 2
        String originalString = "Пример строки для проверки.";
        System.out.println("Исходная строка: " + originalString + " ");

        String searchWord = "строки";
        int index = originalString.indexOf(searchWord);
        System.out.println("Индекс слова " + searchWord + ": " + index);

        if (index != -1) { 
            String partBefore = originalString.substring(0, index);
            String partAfter = originalString.substring(index + searchWord.length());
            System.out.println("Часть до " + searchWord + ": " + partBefore + " ");
            System.out.println("Часть после " + searchWord + ": " + partAfter + " ");
        } else {
            System.out.println("Слово " + searchWord + " не найдено.");
        }

        String upperCaseString = originalString.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseString + " ");

        String lowerCaseString = originalString.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseString + " ");


//       Задание 3
        String productName = "Телефон";
        int quantity = 1;
        double price = 35000.50;

        double totalCost = quantity * price;

        String formattedMessage = String.format("Вы купили %s, количество: %d, итоговая стоимость: %.2f.", productName, quantity, totalCost);
        System.out.println(formattedMessage);

        String anotherProductName = "Чехол";
        int anotherQuantity = 3;
        double anotherPrice = 750.00;
        double anotherTotalCost = anotherQuantity * anotherPrice;
        System.out.println("Вы купили " + anotherProductName + ", количество: " + anotherQuantity + ", итоговая стоимость: " + anotherTotalCost + ".");
}
}
