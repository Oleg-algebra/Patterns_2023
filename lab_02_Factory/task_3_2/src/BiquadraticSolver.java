import java.util.ArrayList;

public class BiquadraticSolver implements Solver {
    @Override
    public ArrayList<Double> findRoots(ArrayList<Double> coefficients) {
        Equation biquadraticEquation = new BiQuadraticEquation();
        return biquadraticEquation.solve(coefficients);
    }
}
