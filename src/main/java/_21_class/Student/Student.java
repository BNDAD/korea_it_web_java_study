package _21_class.Student;

import java.io.InputStream;

public class Student {
    private String name;
    private int age;
    private String email;
    private String address;

    // private일 때 값을 넣는 방법
    // 1. 생성자
    // 2. setter
    Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter

    public String getName() {
        return name;
    }

    public int getAge(int age) {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void showInfo() {
        System.out.println("이름은 " + name + "입니다.");
        System.out.println("나이는 " + age + "입니다");
        System.out.println("이메일은 " + email + "입니다.");
        System.out.println("주소는 " + address + "입니다.");
    }
}