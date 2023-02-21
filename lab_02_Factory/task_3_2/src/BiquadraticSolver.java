import java.util.ArrayList;

public class BiquadraticSolver implements Solver {
    @Override
    public Equation creatEquation(ArrayList<Double> coefficients) {
        return new BiQuadraticEquation(coefficients);
    }
}
