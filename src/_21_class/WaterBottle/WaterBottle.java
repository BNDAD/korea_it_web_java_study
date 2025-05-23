package _21_class.WaterBottle;


public class WaterBottle {
    private int currentWater;

    public void fill(int litter) {
        if (litter > 0 && (litter + currentWater) <= 1000) {
            currentWater += litter;
            System.out.println("현재 물의 양이 " + litter + "만큼 충전되었습니다. 현재 물의 양: " + currentWater + "리터입니다.");
        } else {
            System.out.println("0이상 충전가능하고 물통양을 초과 할 수 없음 현재 물의 양: " + currentWater );
        }

    }

    public void drink(int litter) {
        if (litter > 0 && currentWater >= litter) {
            currentWater -= litter;
            System.out.println(litter + "만큼 마셨습니다. 현재 물의 양: " + currentWater + "리터입니다.");
        } else {
            System.out.println("0이하의 물을 마시거나, 남은 물의 양이 없습니다. 현재 물의 양: " + currentWater);
        }
    }

    public int getCurrentWater() {
        return currentWater;
    }
}
