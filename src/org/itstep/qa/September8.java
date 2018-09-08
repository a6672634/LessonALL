package org.itstep.qa;

public class September8 {
    public static void main(String[] args) {
        int a;
        String b = "dfdfsdf";
        String v = "dfdfsdf";
        System.out.println(b.charAt(2));
        System.out.println(b.length());
        String result = b + v;
        System.out.println(b==v);
        // При сравнении одинаковых переменных программа сравнивает их место в оперативной памяти, их ссылку
        // в оперативном месте хранения. обьекты сравниваются оператором equals.
        System.out.println("--------------------------------");

        String s1 = "123";
        String s2 = "123";
        String s3 = s1.concat(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("---------------------------");

        
    }
}
