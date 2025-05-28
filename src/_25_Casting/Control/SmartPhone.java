package _25_Casting.Control;

public class SmartPhone implements Power {
    @Override
    public void on() {
        System.out.println("SmartPhone의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("SmartPhone의 전원을 끕니다.");
    }
    public void bright() {
        System.out.println("SmartPhone가 반짝입니다.");
    }
}
