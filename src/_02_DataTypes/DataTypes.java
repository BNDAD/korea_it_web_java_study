package _02_DataTypes;

import java.sql.SQLOutput;

public class DataTypes {

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(123);
      /*
       변수
       자료형 변수명 = 데이터;
      */
//    정수 - int, long

        int num = 123;
        int num1;
        num1 = 234;
        num1 = 456;

        System.out.println("num1은 " + num1);

        System.out.println();

        long l = 100_0000_000_000l;
        System.out.println("l은 " + l);

        /*
        실수 = float, double
         */

        float f = 3.14f;
        double d = 3.14159249823842094;

        //문자 - char
        char a = 'd';
        char b = 'f';

        System.out.println("" + a + b);

        //문자열 -String
        String str = "안녕하세요";
        System.out.println(str);

        //논리 자료형 = boolean
        boolean isEmpty;
        isEmpty = true;
        isEmpty = false;

        System.out.println(isEmpty);

        /*
        제 이름은 *** 입니다. 제 나이는 **살이고
        취미는 *** 입니다.

         */


        String name = "김성엽";
        int age = 30;
        String hobby = "게임";
        String mbti = "ENTP";

        System.out.println("제 이름은 " + name + " 입니다. " + "제 나이는 " + age + "살이고");
        System.out.println("취미는 " + hobby + " 입니다.");
        System.out.println("제 MBTI는 " + mbti + " 입니다.");


    }


}