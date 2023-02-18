import java.util.ArrayList;

public class QuadraticSolver implements Solver {
    @Override
    public ArrayList<Double> findRoots(ArrayList<Double> coefficients) {
        Equation quadraticEquation = new QuadraticEquation();
        return quadraticEquation.solve(coefficients);
    }
}
