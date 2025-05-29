package _25_Casting.Control;

public class LEDLight implements Power {
    @Override
    public void on() {
        System.out.println("LED의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("LED의 전원을 끕니다.");
    }
    public void color() {
        System.out.println("LED가 색변경합니다.");
    }
}
