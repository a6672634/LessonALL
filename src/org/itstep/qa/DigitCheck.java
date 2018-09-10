package org.itstep.qa;

import java.util.Scanner;

public class DigitCheck {
    //Задача 1
    //Проверить, является ли введенный символ цифрой
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character:");
        System.out.println(Character.isDigit(scanner.next().charAt(0)));
    }
}
