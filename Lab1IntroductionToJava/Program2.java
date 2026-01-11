package Lab1IntroductionToJava;

//Write a program to display id and name from user.
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your id and Name:");
        int id = input.nextInt();
        String name = input.nextLine();

        System.out.println("ID:" + id + "\t Name:" + name);
    }
}
