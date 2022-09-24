public class Main {
    public static void main(String[] args) {
//        task1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
//        task2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
//        task3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
//        task4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
//        task4
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
//        task5
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
//        task6
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
//        task7
        int total = 0;
        int moneyPlus = 29000;
        for (int i = 1; i <= 12; i++) {
            total = total + moneyPlus;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
//        task8
        int total1 = 0;
        int moneyPlus1 = 29000;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + moneyPlus1;
            total1=total1+total1/100;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total1 + " рублей");
        }
    }
}