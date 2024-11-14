public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int month = 0;
        int salary = 15_000;
        int total = 0;

        while (total < 2_459_000) {
            month = month + 1;
            total = total + salary;
        }
        System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        System.out.println("");

        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int start = 10; start > 0; start--) {
            System.out.print(start + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        float birthRate = 0.017F;
        float mortality = 0.008F;
        int population = 12_000_000;

        for (int year = 1; year <= 10; year++) {
            population = (int) (population + population * birthRate - population * mortality);
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        System.out.println();

        System.out.println("Задача 4");
        int deposit = 15_000;
        int percent = 7;
        int monthes = 0;

        while (deposit <= 12_000_000) {
            monthes++;
            deposit = deposit + deposit * percent / 100;
            System.out.println("Месяц " + monthes + " сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println();

        System.out.println("Задача 5");
        int depositTask5 = 15_000;
        int monthTask5 = 0;

        while (depositTask5 <= 12_000_000) {
            monthTask5++;
            depositTask5 = depositTask5 + depositTask5 * percent / 100;
            if (monthTask5 % 4 == 0) {
                System.out.println("Месяц " + monthTask5 + " сумма накоплений равна " + depositTask5 + " рублей");
            }
        }
        System.out.println();

        System.out.println("Задача 6");
        int depositTask6 = 15_000;
        int monthTask6 = 0;

        while (monthTask6 <= 12 * 9) {
            monthTask6++;
            depositTask6 = depositTask6 + depositTask6 * percent / 100;
            if (monthTask6 % 6 == 0) {
                System.out.println("Месяц " + monthTask6 + " сумма накоплений равна " + depositTask6 + " рублей");
            }
        }
        System.out.println();

        System.out.println("Задача 7");
        int fridayNovember = 1;

        do {
            System.out.println("Сегодня пятница " + fridayNovember + "-е число. Необходимо подготовить отчет");
            fridayNovember = fridayNovember + 7;
        }
        while (fridayNovember <= 31);
        System.out.println();

        System.out.println("Задача 8");
        int start = 0;
        int year = 2024;

        do {
            if (start >= year - 200) {
                System.out.println(start);
            }
            start = start + 79;
        }
        while (start <= year + 100);
    }
}