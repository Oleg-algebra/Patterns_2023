import java.util.ArrayList;

public class LinearSolver implements Solver {
    @Override
    public ArrayList<Double> findRoots(ArrayList<Double> coefficients) {
        Equation linearEquation = new Equation();
        return linearEquation.solve(coefficients);
    }
}
