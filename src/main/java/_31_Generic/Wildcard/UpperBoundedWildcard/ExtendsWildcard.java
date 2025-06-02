package _31_Generic.Wildcard.UpperBoundedWildcard;

public class ExtendsWildcard {
    //<? extends Animal>
    //Dog, Cat, Animal등 Animal을 상속한 모든 타입을 받을 수 있다.
    //상한 경계 와일듴아드(상위 클랫흐 제한)
    //읽기만 됨, 쓰기는 안됨
    //반환타입은 Animal로 취급
    //Animal 또는 Animal을 상속한 타입만 받겠다.
    public static void makeSound(Box<? extends Animal> box) {
        Animal animal = box.getItem();
        animal.sound();

//        box.setItem(new Dog());
    }
}
