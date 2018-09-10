package org.itstep.qa;

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        //Задача 5*
        //Изменить регистр введенного символа, если он был латинской буквой.
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        if(symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 122){
            if(Character.isLowerCase(symbol))
                symbol = Character.toUpperCase(symbol);
            else
                symbol = Character.toLowerCase(symbol);
        }
        System.out.println(symbol);
    }
}
