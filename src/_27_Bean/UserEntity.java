package _27_Bean;

//Bean
//하나의 객체 설계 규칙(명세, 가이드라인)
//멤버변수들은 private => 캡슐화
//기본 생성자
//getter / setter

public class UserEntity {
    private int UserId;
    private String username;
    private int age;
    private String email;

    public UserEntity() {
    }

    public int getUserId() {
        return UserId;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity(" +
                "UserId=" + UserId +
                ", username=" + username +
                ", age=" + age +
                ", email=" + email + ")";
    }

}
