package com.helloworld;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (String i:args
             ) {
            System.out.println(i);
        }
        System.out.println("Hello world! test merge" + "THIS IS A NEW CONTENT IN MATER BRANCH");
        System.out.println("master branch");
        System.out.println("тест");
        System.out.println(fancyOutput(sum(1,2,3)));
        System.out.println(fancyOutput(sub(10, 4)));
        System.out.println("IntelliJ");
        System.out.println("Фактриал 7 равен: " + factorial(7));
        System.out.println(mul(10, 4));
        System.out.println(fancyOutput(div(10, 3)));
        System.out.println(fancyOutput(mul(10, 4)));
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static float div(float a, float b) {
        return a / b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    private static String fancyOutput(int a){
        return "---------------------------\nРезультат операции: " + a + "\n---------------------------";
    }

    private static String fancyOutput(float a) {
        return "---------------------------\nРезультат операции: " + a + "\n---------------------------";
    }
}
