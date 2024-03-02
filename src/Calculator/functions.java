package Calculator;

public class functions {

    private double principal;
    private double rate;
    private double time;
    private double amount;
    private int[] numbers;
    private double totalMarks;
    private double marksObtained;

    // Non-parameterized constructor
    public functions() {
        this.principal = 0;
        this.rate = 0;
        this.time = 0;
        this.amount = 0;
        this.numbers = new int[]{};
        this.totalMarks = 0;
        this.marksObtained = 0;
    }

    // Parameterized constructor
    public functions(double principal, double rate, double time, double amount, int[] numbers, double totalMarks, double marksObtained) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.amount = amount;
        this.numbers = numbers;
        this.totalMarks = totalMarks;
        this.marksObtained = marksObtained;
    }

    // Setters
    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void setMarksObtained(double marksObtained) {
        this.marksObtained = marksObtained;
    }

    // Methods with exception handling

    public double calculateSimpleInterest() {
        return (principal * rate * time) / 100;
    }

    public double calculateCompoundInterest() {
        return principal * Math.pow(1 + rate / 100, time) - principal;
    }

    public double calculateMean() {
        if (numbers.length == 0) {
            throw new ArithmeticException("Cannot calculate mean without numbers.");
        }
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public double calculatePercentage() {
        if (totalMarks <= 0 || marksObtained < 0 || marksObtained > totalMarks) {
            throw new IllegalArgumentException("Invalid marks values for percentage calculation.");
        }
        return (marksObtained / totalMarks) * 100;
    }
}
