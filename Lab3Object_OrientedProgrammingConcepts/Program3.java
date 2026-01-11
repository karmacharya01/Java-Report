package Lab3Object_OrientedProgrammingConcepts;

//Write a program to demonstrate the concept of parameterized constructors.
class Student1 {
    int id;
    String name;
    String lastName;

    Student1(int i, String n, String a) {
        id = i;
        name = n;
        lastName = a;
    }

    void display() {
        System.out.println("ID:" + id + "\t Name:" + name +" "+ lastName);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Student1 student = new Student1(100, "Ram", "Shrestha");
        Student1 student2 = new Student1(101, "Shyam", "Nepali");
        student.display();
        student2.display();
    }
}
