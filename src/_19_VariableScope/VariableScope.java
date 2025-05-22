package _19_VariableScope;

public class VariableScope {
    public static  void methodA() {
        String str = "abd";
//        System.out.println(str);
    }
    public static void main(String[] args) {
        String name = "김성엽";

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
//        System.out.println(i);
        }
    }

