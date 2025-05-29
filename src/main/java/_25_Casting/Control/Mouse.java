package _25_Casting.Control;

public class Mouse implements Power {
    @Override
    public void on() {
        System.out.println("Mouse의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("Mouse의 전원을 끕니다.");
    }
    public void moving() {
        System.out.println("Mouse가 움직입니다.");
    }
}
