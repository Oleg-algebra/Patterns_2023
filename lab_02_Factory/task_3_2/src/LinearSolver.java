import java.util.ArrayList;

public class LinearSolver implements Solver {
    @Override
    public Equation creatEquation(ArrayList<Double> coefficients) {
        return new Equation(coefficients);
    }
}
