import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;
        long average;

        while (count >= 0){
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                number = scanner.nextInt();
                count += 1;
                sum += number;
            } else  if (!isAnInt){
                average = Math.round((double)sum/(double)count);
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}
