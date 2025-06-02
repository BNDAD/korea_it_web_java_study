package _31_Generic.Wildcard.LowerBoundedWildcard;

public class Main {
    public static void main(String[] args) {
        Box<Animal> animalBox = new Box<>();
        Box<Cavalier> cavalierBox = new Box<>();

        SuperWildcard.putDog(animalBox); // OK
//        SuperWildcard.putDog(cavalierBox);
    }
}
