import java.util.Scanner;

public class Factorial {

    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);

        scanner.close();
    }
}

// Result:
// Enter an integer: 5
// The factorial of 5 is 120