package Module1.StreamsAndLambdas.StreamDemo;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {

        List<Student> students = SampleData.getStudentList();

        System.out.println("🔸 All Students:");
        students.forEach(System.out::println);

        //  Filter: Find students who scored more than 85 marks
        System.out.println("\n🔹 Students with marks > 85:");
        students.stream()
                .filter(s -> s.getMarks() > 85)
                .forEach(System.out::println);

        //  Map: Get names of all students
        System.out.println("\n🔹 Names of all students:");
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        //  Distinct: Get unique marks
        System.out.println("\n🔹 Unique marks:");
        students.stream()
                .map(Student::getMarks)
                .distinct()
                .forEach(System.out::println);

        //  Skip: Skip first 2 students and print the rest
        System.out.println("\n🔹 Skipping first 2 students:");
        students.stream()
                .skip(2)
                .forEach(System.out::println);

        // Collect: Get names of all students into a list
        System.out.println("\n🔹 Names list (collected):");
        List<String> names = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
