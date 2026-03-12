class Calculator {

    int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    int subtract(int n1, int n2) {
        int result = n1 - n2;
        return result;
    }
}

class AdvancedCalculator extends Calculator {

    int multiplication(int n1, int n2) {
        int result = n1 * n2;
        return result;
    }

    double division(int n1, int n2) {
        double result = (double) n1 / n2;
        return result;
    }
}

public class Main {

    public static void main(String[] args) {

        AdvancedCalculator calc = new AdvancedCalculator();

        System.out.println("Add: " + calc.add(15, 5));
        System.out.println("Subtract: " + calc.subtract(15, 5));
        System.out.println("Multiply: " + calc.multiplication(15, 5));
        System.out.println("Divide: " + calc.division(15, 5));
    }
}