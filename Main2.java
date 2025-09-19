public class Main2 {

//    public static void main(String[] args) {
//
//    Задание 1
//
//        int int00 = 35;
//        byte byte00 = 10;
//        short short00 = 350;
//        long long00 = 3500000000L; 
//        float float00 = 3.14f;      
//        double double00 = 3.141592653589793;
//
//
//        System.out.println("Значение переменной int00 с типом int равно " + int00);
//        System.out.println("Значение переменной byte00 с типом byte равно " + byte00);
//        System.out.println("Значение переменной short00 с типом short равно " + short00);
//        System.out.println("Значение переменной long00 с типом long равно " + long00);
//        System.out.println("Значение переменной float00 с типом float равно " + float00);
//        System.out.println("Значение переменной double00 с типом double равно " + double00);
//    }


//     public static void main(String[] args) {

//     Задание 2
//
//        int banana1 = 5;
//        int banana2 = 80;
//
//        int milk1= 200;
//       double milk2 = 1.05;
//
//        int iceCream1 = 2;
//        int iceCream2 = 100;
//
//        int eggs1 = 4;
//        int eggs2 = 70;
//
//
//        int allGrams = (banana1 * banana2) +
//                (int)  (milk1 *milk2) +
//                (iceCream1 * iceCream2) +
//                (eggs1  * eggs2 );
//
//        double allKg = allGrams / 1000.0;
//
//        System.out.println("Общий вес спортзавтрака: " + allGrams  + " грамм.");
//        System.out.println("Общий вес спортзавтрака: " + allKg + " килограмм.");
//    }




        public static void main(String[] args) {

//        Задание 3


            String masha = "Маша";
            double mashaSalary = 67760.0;

            String denis = "Денис";
            double denisSalary = 83690.0;

            String kristina = "Кристина";
            double kristinaSalary = 76230.0;


            double salaryUp = 0.10;


            double mashaNewSalary = mashaSalary * (1 + salaryUp);
            double mashaOld = mashaSalary * 12;
            double mashaNew = mashaNewSalary * 12;
            double mashaDifference = mashaNew - mashaOld;


            System.out.println(masha + " теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей.");


            double denisNewSalary = denisSalary * (1 + salaryUp);
            double denisOld = denisSalary * 12;
            double denisNew = denisNewSalary * 12;
            double denisDifference = denisNew - denisOld;

            System.out.println(denis + " теперь получает " + denisNewSalary + " рублей. " + "Годовой доход вырос на " + denisDifference +  " рублей." );


            double kristinaNewSalary = kristinaSalary * (1 + salaryUp);
            double kristinaOld = kristinaSalary * 12;
            double kristinaNew = kristinaNewSalary * 12;
            double kristinaDifference = kristinaNew - kristinaOld;

            System.out.println(kristina + " теперь получает " + kristinaNewSalary + " рублей. " + "Годовой доход вырос на " + kristinaDifference +  " рублей." );
        }
    }



