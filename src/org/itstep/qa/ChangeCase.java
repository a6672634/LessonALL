package org.itstep.qa;

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        //Задача 5*
        //Изменить регистр введенного символа, если он был латинской буквой.
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        if (symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 122) {
            if (Character.isLowerCase(symbol))
                symbol = Character.toUpperCase(symbol);
            else
                symbol = Character.toLowerCase(symbol);
        }
        System.out.println(symbol);

        System.out.println("--------------------");

        //Решение от преподавателя

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите один символ");
        String tempValue = scanner1.next();
        if (tempValue.length() == 1) {
            char ch = tempValue.charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (Character.isLowerCase(ch)) {
                    System.out.println("Результат = " + Character.toUpperCase(ch));
                } else {
                    System.out.println("Результат = " + Character.toLowerCase(ch));
                }
            } else {
                System.out.println("Вы ввели не латинскую букву");
            }
        } else {
            System.out.println("Вы ввели слишком длинное значение");


        }
    }
}



