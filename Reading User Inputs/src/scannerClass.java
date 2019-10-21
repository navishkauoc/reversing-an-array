import java.util.Scanner;

public class scannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        int age = 2019 - birthYear;

        System.out.println("Your name is " + name + " ,and you are " + age + " years old.");

        scanner.close();
    }
}
