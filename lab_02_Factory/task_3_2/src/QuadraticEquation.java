import java.util.ArrayList;
import java.lang.Math;
public class QuadraticEquation extends Equation {

    @Override
    public ArrayList<Double> solve(ArrayList<Double> coefficients) {
        double a = coefficients.get(0);
        double b = coefficients.get(1);
        double c = coefficients.get(2);
        if (a==0){
            roots = super.solve(new ArrayList<>(coefficients.subList(1,coefficients.size())));
            if(roots.size()>1){
                roots.add(0.0);
            }

        }else{
            double D = b*b - 4*a*c;
            if(D<0){
                return roots;
            }else if (D==0) {
                roots.add(-b/(2*a));
            }else{
                roots.add((-b+Math.sqrt(D))/(2*a));
                roots.add((-b-Math.sqrt(D))/(2*a));
            }

        }
        return roots;
    }
}
