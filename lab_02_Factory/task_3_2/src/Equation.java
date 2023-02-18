import java.util.ArrayList;

public class Equation {
    protected ArrayList<Double> roots = new ArrayList<>();

    public ArrayList<Double> solve(ArrayList<Double> coefficients){

        if (coefficients.get(0)!=0){
            double c = coefficients.get(1);
            double b = coefficients.get(0);
            roots.add(-c/b);
            return roots;
        }else{
            if (coefficients.get(1)!=0){
                return roots;
            }else{
                for(int i = 0; i<coefficients.size();i++){
                    roots.add(0.0);
                    }
                return roots;
            }
        }

    }
}
