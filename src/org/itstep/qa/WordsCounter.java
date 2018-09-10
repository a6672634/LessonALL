package org.itstep.qa;

public class WordsCounter {
    public static void main(String[] args) {
        //Дана строка, содержащая пробелы. Найдите, сколько в ней слов (слово – это последовательность символов, отличных от пробела).
        // Все слова разделены одним пробелом.
        String str = "Дана строка, содержащая пробелы.";
        String[] array = str.split(" ");
        System.out.println("String contains " + array.length + " words");
    }
}
