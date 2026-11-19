
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> skills = new ArrayList<>();

        skills.add("Java");
        skills.add("Python");
        skills.add("C++");

        Student s1 = new Student(
            101,
            "Beauty",
            "beauty@gmail.com",
            "CSIT",
            85,
            90,
            skills
        );

        s1.displayDetails();
    }
}
