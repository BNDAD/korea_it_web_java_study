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





