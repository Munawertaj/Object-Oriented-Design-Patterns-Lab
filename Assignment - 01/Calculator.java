interface Addition {
    double add(double num1, double num2);
}

interface Subtraction {
    double subtract(double num1, double num2);
}

interface Multiplication {
    double multiply(double num1, double num2);
}

interface Division {
    double divide(double num1, double num2);
}

public class Calculator implements Addition, Subtraction, Multiplication, Division {
    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 != 0)
            return num1 / num2;

        else {
            System.out.println("Division is not possible since Denominator is ZERO!!!");
            return Double.NaN;
        }
    }
}
