package _06_String;

public class String02 {
    public static void main(String[] args) {
        String str = "I like music and movie and travel.";

        System.out.println(str.replace("and" , ",")); //특정 문자열을 다른 문자열로 대체
        System.out.println(str.substring(7)); //인덱스 기준 7부터 출력
        System.out.println(str.substring(7, 12)); //인덱스 기준 7부터 11까지 출력(끝지점 포함 안해서)
        System.out.println(str.indexOf("movie"));
        System.out.println(str.substring(str.indexOf("movie"), str.indexOf(".")));
        System.out.println();

        str = "     I want to go home    ";
        System.out.println(str.trim()); //문자열 앞 뒤 공백 자르고 출력

        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2)); //해당 문자열 뒤에 다른 문자열을 이어 붙인다.
        System.out.println(s1 + " " + s2);
        System.out.println(s1.concat(" ").concat(s2));

    }
}
