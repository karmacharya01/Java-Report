package Lab2TokenExceptionsAndControlStructure;

//Write a program that demonstrates the use of the break statement and continue statement.
public class Program4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            if (i == 8) {
                break;
            }
            System.out.println(i + " ");
        }
    }
}
