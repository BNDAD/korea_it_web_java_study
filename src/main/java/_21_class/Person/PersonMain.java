package _21_class.Person;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.address);
//        System.out.println(person.id); (private라)
    }
}
