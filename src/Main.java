public class Main {
    public static void main(String[] args) {
//С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
// при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
//Результат программы должен быть выведен в консоль с тем количеством месяцев,
// которое необходимо для накопления данной суммы. Формат сообщения:
// «Месяц …, сумма накоплений равна … рублей» .
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
        int year = 0;

    }
}