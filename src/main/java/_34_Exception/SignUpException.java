package _34_Exception;

class SignFailedException extends Exception {
    public SignFailedException(String message) { //2
        super(message);
        System.out.println("예외가 발생했습니다."); //3
    }
}
public class SignUpException {
    public static void signup(String name, int age) throws SignFailedException {
        if (age <= 14) {
            throw new SignFailedException("14세 미만입니다.");
        }


        System.out.println(name + "님, 회원가입이 완료되었습니다.");
    }

    public static void main(String[] args) {
        String Name = "홍길동";
        int Age = 12;

        try {
            signup(Name, Age);
        } catch (SignFailedException e) {
            System.out.println("회원가입 실패 " + e.getMessage());

        }finally {
            System.out.println("시스템 종료");
        }
    }
    }

//package _34_Exception;
//
//import java.util.Scanner;
//
//class SignFailedException extends Exception {
//    public SignFailedException(String message) {
//        super(message);
//        System.out.println("예외가 발생했습니다.");
//    }
//}
//
//public class SignUpException {
//    public static void signup(String name, int age) throws SignFailedException {
//        if (age < 14) {
//            throw new SignFailedException("14세 미만은 회원가입이 불가능합니다.");
//        }
//        System.out.println(name + "님, 회원가입이 완료되었습니다.");
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("이름을 입력하세요: ");
//        String name = scanner.nextLine();
//
//        System.out.print("나이를 입력하세요: ");
//        int age = 0;
//        try {
//            age = Integer.parseInt(scanner.nextLine());
//        } catch (NumberFormatException e) {
//            System.out.println("나이는 숫자로 입력해야 합니다.");
//            System.out.println("시스템 종료");
//            return;
//        }
//
//        try {
//            signup(name, age);
//        } catch (SignFailedException e) {
//            System.out.println("회원가입 실패: " + e.getMessage());
//        } finally {
//            System.out.println("시스템 종료");
//        }
//    }
//} 이건 입력받아서 14세 미만이면 회원가입 불가하게 만드는 것



