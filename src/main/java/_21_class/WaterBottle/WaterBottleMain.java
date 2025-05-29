package _21_class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle();

        waterBottle.fill(30);
//        waterBottle.fill(1000);
        waterBottle.drink(20);
//        waterBottle.drink(10000);
        System.out.println(waterBottle.getCurrentWater());
    }
}
