package Lab2TokenExceptionsAndControlStructure;

//Write a program to find the grade of a student using switch Case.

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your obtained marks:");
        int marks = input.nextInt();

        switch (marks / 10) {
            case 10:
                System.out.println("Grade A+");
                break;
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B+");
                break;
            case 7:
                System.out.println("Grade B");
                break;
            case 6:
                System.out.println("Grade C+");
                break;
            case 5:
                System.out.println("Grade C");
                break;
            case 4:
                System.out.println("Grade D+");
                break;
            default:
                System.out.println("NG");
        }
    }
}
