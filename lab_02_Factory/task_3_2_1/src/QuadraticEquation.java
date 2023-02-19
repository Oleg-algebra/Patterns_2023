import java.util.ArrayList;
import java.lang.Math;
public class QuadraticEquation extends Equation {

    public QuadraticEquation(ArrayList<Double> coefficients) {
        super(coefficients);
    }

    @Override
    public void solve() {
        double a = coefficients.get(0);
        double b = coefficients.get(1);
        double c = coefficients.get(2);
        if (a==0){
            Solver solver = new LinearSolver();
            Equation equation = solver.creatEquation(new ArrayList<>(coefficients.subList(1,coefficients.size())));
            equation.solve();
            roots = equation.getRoots();
            if(roots.size()>1){
                roots.add(roots.get(roots.size()-1)+1);
            }

        }else{
            double D = b*b - 4*a*c;
            if(D<0){
                ;
            }else if (D==0) {
                roots.add(-b/(2*a));
            }else{
                roots.add((-b+Math.sqrt(D))/(2*a));
                roots.add((-b-Math.sqrt(D))/(2*a));
            }

        }
    }
}
