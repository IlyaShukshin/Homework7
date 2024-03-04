public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int cash = 15000;
        int sum = 0;
        int month = 0;
        while (sum < 2_459_000) {
            sum = sum + sum / 100 * 12;
            sum = sum + cash;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Задача №2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println("Задача №3");
        int population = 12_000_000;
        int birtRate = 17;
        int deathRate = 8;
        int year;
        int allPopulation = 0;
        for (year = 2024; year <= 2034; year++) {
            allPopulation = population / 1000 * (birtRate - deathRate);
            population = allPopulation + population;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("Задача №4");
        int deposit = 15000;
        month = 1;
        int totalDeposit = 12_000_000;
        while (deposit <= totalDeposit) {
            deposit = deposit + deposit / 100 * 7;
            month++;
            System.out.println("Месяц " + month + " сумма " + deposit);
        }
        System.out.println("Задача №5");
        deposit = 15000;
        month = 1;
        totalDeposit = 12_000_000;
        while (deposit <= totalDeposit) {
            deposit = deposit + deposit / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма " + deposit);
            }
            ++month;
        }
        System.out.println("Задача №6");
        year = 9;
        month = year * 12;
        deposit = 15000;
        for (int i = 0; i < month; i++) {
            deposit = deposit + deposit / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма " + deposit);
            }
        }
        System.out.println("Задача №7");
        int friday = 1;
        for (friday = 1; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет");
        }
        System.out.println("Задача №8");
        int currentYear = 2024;
        int lastYears = currentYear - 200;
        int futurYears = currentYear + 100;
        for (; lastYears < futurYears; lastYears++) {
            if (lastYears % 79 == 0)
                System.out.println(lastYears);
        }
        lastYears = lastYears + 79;
    }
}