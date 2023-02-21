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

        double D = b*b - 4*a*c;
        if(D>=0){
            if(D==0){
                double x = -b/(2*a);
                if(x>=0){
                    if(x>0){
                        roots.add(Math.sqrt(x));
                        roots.add(-Math.sqrt(x));
                    }else{
                        roots.add(x);
                    }
                }
            }
            else{
                //System.out.println("--->2");
                double x1 = (-b + Math.sqrt(D))/(2*a);
                double x2 = (-b - Math.sqrt(D))/(2*a);
                if(x1>=0){
                    if(x1==0){
                        roots.add(x1);
                    }else{
                        roots.add(Math.sqrt(x1));
                        roots.add(-Math.sqrt(x1));
                    }
                }
            if(x2>=0){
                if(x2==0){
                    roots.add(x2);
                }else{
                    roots.add(Math.sqrt(x2));
                    roots.add(-Math.sqrt(x2));
                }
            }
        }
    }

}
}
