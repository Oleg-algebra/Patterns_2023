import java.util.ArrayList;

public class Equation implements Clonable {
    protected ArrayList<Double> roots = new ArrayList<>();
    protected ArrayList<Double> coefficients;

    public ArrayList<Double> getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(ArrayList<Double> coefficients) {
        this.coefficients = coefficients;
    }

    public Equation(ArrayList<Double> coefficients) {
        this.coefficients=coefficients;
    }
    public Equation(Equation other){
        this.coefficients = other.coefficients;
        this.roots = other.roots;
    }

    public ArrayList<Double> getRoots() {
        return roots;
    }

    public void solve(){

        if (coefficients.get(0)!=0){
            double c = coefficients.get(1);
            double b = coefficients.get(0);
            roots.add(-c/b);
        }
    }

    @Override
    public String toString() {
        return "Equation{" +
                "roots=" + roots +
                ", coefficients=" + coefficients +
                '}';
    }

    @Override
    public Equation clone() {
        return new Equation(this);
    }
}
