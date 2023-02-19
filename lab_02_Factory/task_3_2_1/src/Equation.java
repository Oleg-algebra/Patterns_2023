import java.util.ArrayList;

public class Equation {
    protected ArrayList<Double> roots = new ArrayList<>();
    protected ArrayList<Double> coefficients;

    public ArrayList<Double> getCoefficients() {
        return coefficients;
    }

    public Equation(ArrayList<Double> coefficients) {
        this.coefficients=coefficients;
    }

    public ArrayList<Double> getRoots() {
        return roots;
    }

    public void solve(){

        if (coefficients.get(0)!=0){
            double c = coefficients.get(1);
            double b = coefficients.get(0);
            roots.add(-c/b);

        }else{
            if (coefficients.get(1)!=0){
                ;
            }else{
                for(int i = 0; i<coefficients.size();i++){
                    roots.add((double) i+1);
                    }
            }
        }

    }
}
