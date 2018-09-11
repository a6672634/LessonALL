package org.itstep.qa;

import java.util.Arrays;

public class WordsCounter {
    public static void main(String[] args) {
        //Дана строка, содержащая пробелы. Найдите, сколько в ней слов (слово – это последовательность символов, отличных от пробела).
        // Все слова разделены одним пробелом.
        String str = "Дана строка, содержащая пробелы.";
        String[] array = str.split(" ");
        System.out.println("String contains " + array.length + " words");


        System.out.println("-------------------");

        String testLine = "Мама  мыла раму";
        String[] result = testLine.split(" ");
        System.out.println(Arrays.toString(result));
        int counter = 0;
        for (int i = 0; i < result.length; i++) {
            if (!result[i].isEmpty()) {
                counter++;
            }
        }
        // Это форич так пишут тоже
        for(String tempValue : result)
            if(!tempValue.isEmpty()){
            counter++;
            }
        System.out.println("Количество слов равно " + counter);

        System.out.println("---------------------");

        String testLine1 = "Мама  мыла раму";
        String[] result2 = testLine1.split(" +");
        System.out.println(Arrays.toString(result2));
        System.out.println("Количество слов равно " + result2.length);
    }
}
