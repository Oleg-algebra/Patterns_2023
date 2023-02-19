import java.util.ArrayList;

public class QuadraticSolver implements Solver {
    @Override
    public Equation creatEquation(ArrayList<Double> coefficients) {
        return new QuadraticEquation(coefficients);
    }
}
