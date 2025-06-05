package _34_Exception;

import java.util.Scanner;

public class DivideException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하시오");
        int input1 = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하시오");
        int input2 = scanner.nextInt();


        try {
            int result = input1 / input2;
            System.out.println("결과: " + result);

        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }finally {
            System.out.println("프로그램 정상종료");
        }
    }
}
