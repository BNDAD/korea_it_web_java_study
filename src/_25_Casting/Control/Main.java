package _25_Casting.Control;

public class Main {
    public static void main(String[] args) {
        //Power 인터페이스
        //on(), off()
        //Tv, Computer, Speaker, LedLight, Mouse, SmartPhone 클래스
        //재정의하고 고유메소드 1개


       /* Power[] powers = new Power[5];
        CentralControl centralControl = new CentralControl(powers);*/
        CentralControl centralControl = new CentralControl((new Power[5]));

        centralControl.addDevice(new Computer());
        centralControl.addDevice(new Tv());
        centralControl.addDevice(new Mouse());
        centralControl.addDevice(new LEDLight());
        centralControl.addDevice(new Speaker());
        centralControl.addDevice(new SmartPhone());
        System.out.println();

        centralControl.powerOn();
        System.out.println();

        centralControl.powerOff();
        System.out.println();

        centralControl.perfformSpecificMethod();
    }
}
