package com.helloworld;
import org.apache.commons.lang3.RandomStringUtils;
public class Main {

    /**
     * main class for some calculating functions
     * @param args comments before the result
     */
    public static void main(String[] args) {



        String s = RandomStringUtils.random(12);
        System.out.println(s);



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

    /**
     * Sum function
     * @param a 1-st param
     * @param b 2-nd param
     * @param c 3-rd param
     * @return int value (sum)
     */
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Sum function
     * @param a 1-st param
     * @param b 2-nd param
     * @return int value (sub)
     */
    public static int sub(int a, int b) {
        return a - b;
    }

    /**
     * Sum function
     * @param a 1-st param
     * @param b 2-nd param
     * @return int value (div)
     */
    public static float div(float a, float b) {
        return a / b;
    }

    /**
     * Sum function
     * @param a 1-st param
     * @param b 2-nd param
     * @return int value (mul)
     */
    public static int mul(int a, int b) {
        return a * b;
    }

    /**
     * Factorial function
     * @param n number (int)
     * @return int value (factorial)
     */
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    /**
     * Output function
     * @param a 1-st param
     * @return string value (format string)
     */
    public static String fancyOutput(int a){
        return "---------------------------\nРезультат операции: " + a + "\n---------------------------";
    }

    /**
     * Output function
     * @param a 1-st param
     * @return string value (format string)
     */
    public static String fancyOutput(float a) {
        return "---------------------------\nРезультат операции: " + a + "\n---------------------------";
    }
}
