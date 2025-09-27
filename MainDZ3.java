public class MainDZ3 {
    public static void main(String[] args) {
//        Задание 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------");

//        Задание 2
        for (int i = 0; i <= 21; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("-----------------");

//        Задание 3
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------");

//        Задание 4
        int month_Save = 12000;
        int total_Save = 0;

        for (int month = 1; month <= 12; month++) {
            total_Save = total_Save + month_Save;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total_Save + " рублей");
        }



    }
}
