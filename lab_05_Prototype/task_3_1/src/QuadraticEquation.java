import java.util.ArrayList;
import java.lang.Math;
public class QuadraticEquation extends Equation {

    public QuadraticEquation(ArrayList<Double> coefficients) {
        super(coefficients);
    }

    public QuadraticEquation(QuadraticEquation other) {
        super(other);
    }

    @Override
    public void solve() {
        double a = coefficients.get(0);
        double b = coefficients.get(1);
        double c = coefficients.get(2);

        double D = b*b - 4*a*c;
        if(D>=0) {
            if (D == 0) {
                roots.add(-b / (2 * a));
            } else {
                roots.add((-b + Math.sqrt(D)) / (2 * a));
                roots.add((-b - Math.sqrt(D)) / (2 * a));
            }
        }

    }


    @Override
    public Equation clone() {
        return new QuadraticEquation(this);
    }
}
