package _35_Lambda;

public class CaculatorMain {
    public static int operate(int a, int b, Caculator c) {
        return c.caculate(a, b);
    }

    public static void main(String[] args) {
        Caculator add = (x, y) -> x + y;
        Caculator sub = (x, y) -> x - y;
        Caculator mul = (x, y) -> x * y;
        Caculator div = (x, y) -> x / y;

        System.out.println("2 + 2 = " + operate(2, 2, add));
        // => (2, 2) -> 2 + 2;
        System.out.println("2 - 3 = " + operate(2, 3, sub));
        System.out.println("2 * 3 = " + operate(2, 3, mul));
        System.out.println("2 / 3 = " + operate(2, 3, div));


        Caculator div3 = (x, y) -> {
            if (y == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return x / y;
        };
        System.out.println("2 / 0 = " + operate(2, 0, div3));

    }
}
