import java.util.ArrayList;

public class BiQuadraticEquation extends Equation {
    @Override
    public ArrayList<Double> solve(ArrayList<Double> coefficients) {
        double a = coefficients.get(0);
        double b = coefficients.get(2);
        double c = coefficients.get(4);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        if(a==0){
            roots = quadraticEquation.solve(new ArrayList<>(coefficients.subList(2,coefficients.size())));
            if(roots.size()>2){
                roots.add(0.0);
                roots.add(0.0);

            }
        }else{
            ArrayList<Double> roots1;
            ArrayList<Double> coeff = new ArrayList<>();
            coeff.add(a);
            coeff.add(b);
            coeff.add(c);
            roots1 = quadraticEquation.solve(coeff);
            //System.out.println(roots1);
            roots.clear();
            if(roots1.size()==0){
                return roots;
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
        return roots;
    }
}
