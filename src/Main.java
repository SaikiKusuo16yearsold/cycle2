public class Main {

    public static void main(String[] args) {
        //задача 1
        int startCapital = 0;
        int months = 0;
        while (startCapital < 2459000) {
            startCapital += 15000;
            months++;
            System.out.println("Месяц " + months + " сумма накоплений равна " + startCapital + " рублей");
        }
//        System.out.println("Месяц " + months + " сумма накоплений равна " + startCapital + " рублей");

        //задача 2
        int numbers = 1;
        while (numbers <= 10) {
            System.out.print(numbers + " ");
            numbers += 1;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //задача 3
        int population = 12000000;
        for (byte i = 0; i <= 10; i++) {
            population = (int) (population * 1.07f);
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
        //задача 4
        int startCapital2 = 15000;
        for (int i = 1; startCapital2 < 12000000; i++) {
            startCapital2 = (int) (startCapital2 * 1.07f);
            System.out.println("Месяц " + i + " " + startCapital2);

        }
        //задача 5
        int startCapital1 = 15000;
        for (int i = 1; startCapital1 < 12000000; i++) {
            startCapital1 = (int) (startCapital1 * 1.07f);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " " + startCapital1);
            }
        }
        //задача 6
        int startingCapital = 15000;
        for (byte month = 0; month <= 9 * 12; month++) {
            startingCapital = (int) (startingCapital * 1.07f);
            if (month % 6 == 0 && month > 0) {
                System.out.println("Сумма накоплений " + startingCapital);
            }
        }
        //задача 7
        int firstFriday = 5;
        for (int currentDay = firstFriday; currentDay <= 31; currentDay += 7) {
            System.out.println("Сегодня пятница, " + currentDay + "число. Необходимо подготовить отчет");
        }

        //задача 8
        int start = 0;
        while (start <= 2124) {
            start += 79;
            if (start >= 1824 && start <= 2124) {
                System.out.println(start);
            }
        }
    }

}







