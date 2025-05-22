package _21_class.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();

        System.out.println();

        Car car2 = new Car("아반떼");

        System.out.println();

        Car car3 = new Car("싼타페", 2025, "white");

        car3.startCar();
        car3.drive();

    }
}
