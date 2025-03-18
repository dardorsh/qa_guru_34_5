package qa.guru;

public class Main {
    public static void main(String[] args) {

        // применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(b - a);
        System.out.println(a * b);
        System.out.println(a / b);

        // применить несколько арифметических операций над int и double в одном выражении
        int x = 5;
        double y = 2.5;

        double result = x + y * 2 - x / y;
        System.out.println(result);

        //применить несколько логических операций ( < , >, >=, <= )
        int num1 = 7;
        int num2 = 10;

        boolean isLess = num1 < num2;
        boolean isGreater = num1 > num2;
        boolean isGreaterOrEqual = num1 >= 7;
        boolean isLessOrEqual = num2 <= 10;

        System.out.println(isLess);
        System.out.println(isGreater);
        System.out.println(isGreaterOrEqual);
        System.out.println(isLessOrEqual);

        //переполнение
        int maxInt = Integer.MAX_VALUE;
        int overflow = maxInt + 1;
        System.out.println(overflow);

    }
}