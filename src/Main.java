public class Main {
    public static void main(String[] args) {

        double money = 0;
        int month = 1;
        while (money < 2459000) {
            money += 15000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (int) money + " рублей");
            month++;
        }

        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

        double people = 12000000;
        int deathPeople = 8;
        int birthPeople = 17;
        for (int year = 1; year <= 10; year++) {
            double death = people / 1000 * 8;
            double birth = people / 1000 * 17;
            people = people + birth - death;
            System.out.println("Год " + year + ", численность населения составляет " + (long) people);
        }

        money = 15000;
        month = 1;
        while (money < 12000000) {
            money = money * 1.07;
            month++;
            System.out.println("На " + month + " месяц Василий накопил " + (int) money + " рублей");
        }

        money = 15000;
        month = 1;
        while (money < 12000000) {
            money = money * 1.07;
            month++;
            if (month % 6 == 0) {
                System.out.println("На " + month + " месяц Василий накопил " + (int) money + " рублей");
            }
        }

        money = 15000;
        month = 1;
        while (month < 9 * 12) {
            money = money * 1.07;
            month++;
            if (month % 6 == 0) {
                System.out.println("На " + month + " месяц Василий накопил " + (int) money + " рублей");
            }
        }

        int friday = 1;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        for (int year = 2024 - 200; year < 2024 + 100; year ++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }

        }
    }
}