package _21_class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "김성엽";
        student.age = 30;
        student.email = "fasdfasf@sadfsaf.com";
        student.address = "부산";

        student.showInfo();
    }
}
