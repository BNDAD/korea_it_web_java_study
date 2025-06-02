package _29_Builder;

public class MemberLombokMain {
    public static void main(String[] args) {
        MemberLombok memberLombok = MemberLombok.builder()
                .age(27)
                .email("dongyoon7212@naver.com")
                .name("이동윤")
                .build();
    }
}