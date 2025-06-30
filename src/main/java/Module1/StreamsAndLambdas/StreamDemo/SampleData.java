package Module1.StreamsAndLambdas.StreamDemo;

import java.util.Arrays;
import java.util.List;

public class SampleData {

    public static List<Student> getStudentList() {
        return Arrays.asList(
                new Student("Alice", 18, 91.5),
                new Student("Bob", 20, 84.0),
                new Student("Charlie", 19, 67.5),
                new Student("David", 21, 45.0),
                new Student("Eva", 22, 89.0),
                new Student("Frank", 20, 45.0), // Edge case: same marks
                new Student("Grace", 18, 91.5)  // Edge case: same name & marks
        );
    }
}
