package Lab3Object_OrientedProgrammingConcepts;

//Write a program to demonstrate the concept of the ‘this’ keyword.
class Watermelon {
    int id;
    String name;

    Watermelon(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID:" + id + "\t Name:" + name);
    }
}

public class Program2 {
    public static void main(String[] args) {
        Watermelon Student = new Watermelon(100, "Hari");
        Watermelon Student1 = new Watermelon(101, "Ram");
        Student.display();
        Student1.display();
    }
}
