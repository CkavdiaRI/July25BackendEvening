package Generics;
import java.util.*;

// ---------------------------------------------
// 👤 Class Hierarchy for the Company
// ---------------------------------------------

class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() { return name; }
    public String getRole() { return "Person"; }

    @Override
    public String toString() {
        return getRole() + ": " + name;
    }
}

class Employee extends Person {
    public Employee(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Employee";
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}

class Intern extends Employee {
    public Intern(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Intern";
    }
}

// ---------------------------------------------
// 🛠️ Utility Class: Demonstrates Generics
// ---------------------------------------------
class CompanyUtils {

    /**
     * ✅ Upper Bounded Wildcard
     * Accepts List of Employee or any subclass (Manager, Intern)
     * Used for reading roles (safe)
     */
    public static void printEmployeeRoles(List<? extends Employee> staffList) {
        System.out.println("📋 Roles in Staff List:");
        for (Employee e : staffList) {
            System.out.println("- " + e.getRole() + " (" + e.getName() + ")");
        }
    }

    /**
     * ✅ Lower Bounded Wildcard
     * Allows adding Employee or subclass to a list of supertypes (Person, Object)
     * Safe for writing
     */
    public static void addEmployees(List<? super Employee> generalList) {
        generalList.add(new Employee("Alice"));
        generalList.add(new Manager("Bob"));
        generalList.add(new Intern("Charlie"));

        // ❌ Can't read specific properties from `generalList`, only treat as Object
        System.out.println("✅ Added Employees to generalList (write-safe)");
    }

    /**
     * ✅ Upper Bounded Type Parameter (Generic Method)
     * Works with any T that extends Employee
     */
    public static <T extends Employee> void promoteToManager(List<T> employeeList) {
        System.out.println("🎓 Promoting employees to manager titles (simulation):");
        for (T emp : employeeList) {
            System.out.println(emp.getName() + " is now a Manager!");
        }
    }

    /**
     * ✅ Type Parameter with No Bound - Pure Generic
     */
    public static <T> void displayList(List<T> list) {
        System.out.println("📦 Displaying all elements:");
        for (T item : list) {
            System.out.println("- " + item);
        }
    }
}

// ---------------------------------------------
// 🚀 Test Code in Main Method
// ---------------------------------------------
class CompanyDemo {
    public static void main(String[] args) {

        // 👩‍💼 List of specific employee types
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Eve"),
                new Intern("Jake")
        ));

        List<Manager> managers = new ArrayList<>(List.of(
                new Manager("Sophie"),
                new Manager("Daniel")
        ));

        List<Person> people = new ArrayList<>();

        // ✅ 1. Upper Bounded Wildcard - Reading roles
        CompanyUtils.printEmployeeRoles(employees);   // List<Employee>
        CompanyUtils.printEmployeeRoles(managers);    // List<Manager>

        System.out.println();

        // ✅ 2. Lower Bounded Wildcard - Adding Employees
        CompanyUtils.addEmployees(people);            // List<Person>
        CompanyUtils.displayList(people);             // Object-safe reading

        System.out.println();

        // ✅ 3. Upper Bounded Type Parameter - Promotion Logic
        CompanyUtils.promoteToManager(employees);
        CompanyUtils.promoteToManager(managers);

        System.out.println();

        // ✅ 4. Generic Method for Displaying Any List
        CompanyUtils.displayList(managers);
        CompanyUtils.displayList(Arrays.asList("HR", "Finance", "IT"));  // List<String>
    }
}
