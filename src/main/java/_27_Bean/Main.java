package _27_Bean;

public class Main {
    public static void main(String[] args) {
        //UserEntity
        //UserId(int), username, age(int), email => private
        //기본생성자 하나 만들기
        //getter / setter

        //toString 오버라이드해서 정보 모두 출력되도록
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUsername("이동윤");
        userEntity.setAge(27);
        userEntity.setEmail("dongyoon7212@naver.com");

        System.out.println(userEntity);

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(2);
        userEntityLombok.setUsername("홍길동");
        userEntityLombok.setAge(18);
        userEntityLombok.setEmail("gildong@gmail.com");

        System.out.println(userEntityLombok);
    }
}



