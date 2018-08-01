package com.helloworld;
import java.io.IOException;

public class NeMain {

    public static void main(String[] args) throws IOException {
        Version ver = new Version();
        System.out.println("Версия программы: " + ver.version + "!");
        System.out.println("Это другой класс для отладки.");
        System.out.println((5+3)+ "=8!");
        System.out.println((5*3)+ "=15!");
    }

}
