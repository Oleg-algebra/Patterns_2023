import java.util.ArrayList;
import java.util.List;

public class BiQuadraticEquation extends Equation {
    public BiQuadraticEquation(ArrayList<Double> coefficients) {
        super(coefficients);
    }

    @Override
    public void solve() {
        double a = coefficients.get(0);
        double b = coefficients.get(2);
        double c = coefficients.get(4);
        Solver quadraticSolver = new QuadraticSolver();
        Equation quadraticEquation;
        if(a==0){
            quadraticEquation = quadraticSolver.creatEquation(new ArrayList<>(coefficients.subList(2,coefficients.size())));
            quadraticEquation.solve();
            roots = quadraticEquation.getRoots();
            if(roots.size()>2){
                while(roots.size()<coefficients.size()){
                    roots.add(roots.get(roots.size()-1)+1);
                }

            }
        }else{
            ArrayList<Double> roots1;
            ArrayList<Double> coeff = new ArrayList<>();
            coeff.add(a);
            coeff.add(b);
            coeff.add(c);
            quadraticEquation = quadraticSolver.creatEquation(coeff);
            quadraticEquation.solve();
            roots1 = quadraticEquation.getRoots();
                    //System.out.println(roots1);
            roots.clear();
            if(roots1.size()==0){
                ;
            }else{
                for (double x : roots1) {
                    if (x > 0) {
                        roots.add(Math.sqrt(x));
                        roots.add(-Math.sqrt(x));
                    } else if (x == 0) {
                        roots.add(0.0);
                    }
                }
            }
        }
    }
}
