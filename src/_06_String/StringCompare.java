package _06_String;

import java.sql.SQLOutput;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Python";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));
        System.out.println(str2.equalsIgnoreCase("python"));

        System.out.println();


        String password1 = "1234";
        String password2 = "1234";
        // 1234가 저장되어 있는 메모리 공간을
        // password1, password2가 같은 공간을 참조하고 있다.

        System.out.println(password1 == password2); // ==은 참조 위치 비교
        System.out.println(password1.equals(password2)); // equals는 내용이 같은가 비교
        password1 = new String("1234");
        password2 = new String("1234");
        /*
        new를 이용하면 내용이 같더라도 새로운 메모리 공간을 각각 할당하여
        다른 위치에 저장, 각각 참조하고 있음
         */
        System.out.println(password1 == password2); // 참조 위치가 다름
        System.out.println(password1.equals(password2)); // 하지만 내용은 같다.

    }
}
