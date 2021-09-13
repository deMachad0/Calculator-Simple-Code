public class TestCalculator {
    public static void main(String[] args) {

        double a = 2.5;
        double b = 3.5;

        Calculator[] c = Calculator.values();

        for (int i = 0; i < c.length; i++) {
            System.out.print(a + " ");
            System.out.print(c[i].toString() + " ");
            System.out.print(b + " = ");
            System.out.println(c[i].calculatorExec(a, b));
        }

    }
}