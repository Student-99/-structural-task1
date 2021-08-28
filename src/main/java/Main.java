public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        IntsCalculator intsCalculator = new IntsCalculator();
        System.out.println("default MULT: " +
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );
        System.out.println("default POW: " +
                calc.newFormula()
                        .addOperand(2)
                        .addOperand(3)
                        .calculate(Calculator.Operation.POW)
                        .result()
        );
        System.out.println("default SUM: " +
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.SUM)
                        .result()
        );
        System.out.println();
        System.out.println("Adapter MULT: " + intsCalculator.mult(5, 15));
        System.out.println("Adapter POW: " + intsCalculator.pow(2, 3));
        System.out.println("Adapter SUM: " + intsCalculator.sum(5, 15));
    }
}
