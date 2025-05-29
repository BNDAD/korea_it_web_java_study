package _27_Bean;

public class Main {
    public static void main(String[] args) {
        //UserEntity
        //UserId, username, age, email => private
        //기본생성자 하나 만들기
        //getter / setter

        //toString 오버라이드해서 정보 모두 출력되도록
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUsername("김성엽");
        userEntity.setAge(30);
        userEntity.setEmail("fdasjflks@asddfasf.com");

        System.out.println(userEntity);
    }
}
