public enum Calculator {

    ADDITION("+") {
        @Override
        public double calculatorExec(double a, double b) {
            return a + b;
        }
    },
    SUBTRACTION("-") {
        @Override
        public double calculatorExec(double a, double b) {
            return a - b;
        }
    },
    MULTIPLICATION("*") {
        @Override
        public double calculatorExec(double a, double b) {
            return a * b;
        }
    },
    DIVISION("/") {
        @Override
        public double calculatorExec(double a, double b) {
            return a / b;
        }
    };

    private String simbol;

    Calculator(String simbol) {
        this.simbol = simbol;
    }

    public String toString() { // return the simbol through a method
        return this.simbol;
    }

    public abstract double calculatorExec(double a, double b);
}