package org.itstep.qa;

public class Substring {
    public static void main(String[] args) {
        //Задача 3
        //Даны две строки. Определите, является ли первая строка подстрокой второй строки. (Можно использовать метод contains).
        String first = "Fuck";
        String second = "Hello world";
        System.out.println(second.contains(first));
    }
}
