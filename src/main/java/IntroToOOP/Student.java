package IntroToOOP;

public class Student {
    // Attributes/Data/Properties
    String name;
    public int age;
    int studentID;

    // Custom constructor. Not visible to you directly but present only if there is mo custom constructor
    Student(){
        name = "Chirag";
        age = 100;
        studentID = 11;
    }

    //Parameterized constructors
    Student(String name, int age, int studentID){
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    //Parameterized constructors
    Student(String name){
        this.name = name;
        age = 0;
        studentID = 0;
    }

    //Behaviours/Methods/Functions
    void submitAssignment(int assignmentID){
        System.out.println("Completed assignment " + assignmentID);
    }
    void attendingClass(int classID){
        System.out.println("Student "+name+" is attending class " + classID);
    }

    public int getStudentId(){// getter function
        return studentID;
    }

    void setStudentID(int input){// setter function
        studentID = input;
    }
}
