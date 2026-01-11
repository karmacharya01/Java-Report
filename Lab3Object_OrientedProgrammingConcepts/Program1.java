package Lab3Object_OrientedProgrammingConcepts;

//Write a program to demonstrate the concept of class and object.
class Student0 {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Program1 {
    public static void main(String[] args) {

        // Creating object of Student class
        Student0 s1 = new Student0();

        // Assigning values
        s1.id = 100;
        s1.name = "Kritish";

        // Calling method using object
        s1.display();
    }
}
