import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        int number = 0;

        while (count <= 10){
            System.out.println("Enter number #" + count + " : ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                number = scanner.nextInt();
                count++;
                sum += number;
            } else {
                System.out.println("Invalid number");
                scanner.nextLine();
                //break;
                continue;
            }
        }

        System.out.println("Total : " + sum);

        scanner.close();
    }
}
