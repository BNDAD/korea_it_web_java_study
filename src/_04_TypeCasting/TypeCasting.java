package _04_TypeCasting;

import java.sql.SQLOutput;
import java.sql.SQLTimeoutException;

public class TypeCasting {
    public static void main(String[] args) {
        //형변환

        //정수에서 실수로

        int scoreInt =98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt);
        System.out.println((double) scoreInt);
        System.out.println(scoreInt);

        //실수에서 정수로
        float scoreFloat = 97.5f;
        System.out.println(scoreFloat);
        System.out.println((int) scoreFloat);

        double scoreDouble = 88.5;
        System.out.println((int) scoreDouble);

        double sum1 = 98 + 77.3;
        System.out.println(sum1);

        int sum2 = 98 + (int) 55.3f;
        System.out.println(sum2);

        int convertedScoreInt = (int) scoreDouble;
        System.out.println(convertedScoreInt);
        // int -> long -> float -> double(수동형변환)

        double convertedScoreDouble = scoreInt;
        System.out.println(convertedScoreDouble);
        // double -> float -> long -> int(자동형변환)

        long scoreLong =45L;
        convertedScoreInt = (int) scoreLong;
        System.out.println(convertedScoreInt);

        //숫자를 문자열로
        String strNum1 = String.valueOf(55);//첫번째 방법
        strnum1 = Integer.toString(55);//두번째 방법
        System.out.println(strNum1);

        String strNum2 = String.valueOf(88.34);
        strNum2 = Double.toString(88.34);
        System.out.println(strNum2);

        //float에서 문자열
        String strNum3 = String.valueOf(123.45);
        strNum3 = Float.toString(123.45F);
        System.out.println(strNum3);

        //문자열을 숫자로 "123" -> 123
        int i = Integer.parseInt("123");
        System.out.println(i);
        double d = Double.parseDouble(123.45);
        System.out.println(d);
    }}