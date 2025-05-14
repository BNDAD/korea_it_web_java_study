package _03_VariablesNaming;

public class VariableNaming {
    public static void main(String[] args) {
        /*
        변수명 짓는법
        1. 저장되는 데이터에 어울린느 이름, 직괒넉이고 한눈에 파악하기 쉬운 이름
        2. 밑줄(_), 문자, 숫자 사용가능, 단 숫자가 맨앞에 올 수 없다.
        3. 한 단어 또는 2개 이상 단어를 연속해서 사용 가능
        4. 소문자로 시작하고, 두번째 단어부터는 시작글자를 대문자
        파스칼 표기법(쌍봉낙타 표기법) => LastName => 클래스명, 파일명
        카멜 표기법(단봉낙타 표기법) => lastName => 변수명, 메소드명
        5. 예약어 사용 불가(public, static, void, int, float, ....)


         */

        String carBrandName = "KIA";
        String carModelName = "EV6";
        String carColor = "white";
        int carPassengerCapacity = 5;
        int carModelYear = 2025;

        //상수 절대 변하지 않는 데이터 => 상수명 다 대문자
        final String COUNTRY_CODE = "KR";


    }
}
