package home_practic.calculator;

public class TestCalculator {
    public static void main(String[] args) {
        CalculatorFrame frame = new CalculatorFrame();
        CalculatorController controller = new CalculatorController(frame);
        frame.setControllers(controller);
    }
}
