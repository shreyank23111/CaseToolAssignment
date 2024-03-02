package Calculator;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Taking user inputs for simple interest calculation
        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // Creating an instance of SmartCalculator
        functions calculator = new functions(principal, rate, time, 0, new int[]{}, 0, 0);

        // Calculating and displaying simple interest
        double simpleInterest = calculator.calculateSimpleInterest();
        System.out.println("Simple Interest: " + simpleInterest);

        // Taking user inputs for mean calculation
        System.out.print("Enter the number of elements for mean calculation: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        calculator.setNumbers(numbers);

        // Calculating and displaying mean
        double meanValue = calculator.calculateMean();
        System.out.println("Mean of Numbers: " + meanValue);

        // Taking user input for factorial calculation
        System.out.print("Enter a number for factorial calculation: ");
        int factorialInput = scanner.nextInt();

        // Calculating and displaying factorial
        int factorialValue = calculator.calculateFactorial(factorialInput);
        System.out.println("Factorial of " + factorialInput + ": " + factorialValue);

        // Taking user inputs for percentage calculation
        System.out.print("Enter Total Marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.print("Enter Marks Obtained: ");
        double marksObtained = scanner.nextDouble();

        calculator.setTotalMarks(totalMarks);
        calculator.setMarksObtained(marksObtained);

        // Calculating and displaying percentage
        double percentageObtained = calculator.calculatePercentage();
        System.out.println("Percentage Obtained: " + percentageObtained + "%");

        scanner.close();

	}

}
