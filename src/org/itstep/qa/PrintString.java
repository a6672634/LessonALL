package org.itstep.qa;

import java.util.Scanner;

public class PrintString {
    public static void main(String[] args) {
        //Задача 2
        //Создать строку и проинициализировать ее каким-либо значением. Вывести значение строки на экран.
        // Присвоить этой же строке значение, введенное с клавиатуры и также вывести его на экран.
        String str = "Hello";
        System.out.println(str);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some string:");
        str = scanner.nextLine();
        System.out.println(str);
    }
}
