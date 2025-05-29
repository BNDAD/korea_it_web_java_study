package _25_Casting.Control;

public class Tv implements Power {
    @Override
    public void on() {
        System.out.println("Tv의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("Tv의 전원을 끕니다.");
    }
    public void drama() {
        System.out.println("Tv가 드라마를 틉니다.");
    }
}