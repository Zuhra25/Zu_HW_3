public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1:");
        byte a = 127;
        short b = 30000;
        int c = 2000000;
        long d = 9000000000000000000L;
        float n = - 1.1f;
        double m = -99.99;
        System.out.println("Значение переменной _а_ с типом byte равно "+ a);
        System.out.println("Значение переменной _b_ с типом short равно "+ b);
        System.out.println("Значение переменной _c_ с типом int равно "+ c);
        System.out.println("Значение переменной _d_ с типом long равно "+ d);
        System.out.println("Значение переменной _n_ с типом float равно "+ n);
        System.out.println("Значение переменной _m_ с типом double равно "+ m);
    }
    public static void task2 () {
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3:");
        byte LudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper / (LudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna) + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4:");
        byte bottles = 16;
        byte minute = 2;
        int bottlesInMinute = bottles / minute; // почему не short?
        int in20minute = bottlesInMinute * 20;
        int inDay = bottlesInMinute * 24 * 60;
        int in3days = inDay * 3;
        int inMounth = inDay * 30;
        System.out.println("За 20 минут машина произвела " + in20minute);
        System.out.println("За сутки машина произвела " + inDay);
        System.out.println("За 3 дня машина произвела " + in3days);
        System.out.println("За 1 месяц машина произвела " + inMounth);
    }



}
