import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private ArrayList<ArrayList<Double>> oneRoot = new ArrayList<>();
    private ArrayList<ArrayList<Double>> twoRoots = new ArrayList<>();
    private ArrayList<ArrayList<Double>> threeRoots = new ArrayList<>();
    private ArrayList<ArrayList<Double>> fourRoots = new ArrayList<>();
    private ArrayList<ArrayList<Double>> infRoots = new ArrayList<>();
    private ArrayList<ArrayList<Double>> noRoots = new ArrayList<>();
    private double maxRoot = Double.MIN_NORMAL;
    private double minRoot = Double.MAX_VALUE;
    public void solveTask(String fileName) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanner.hasNextLine()){
            Solver solver;
            ArrayList<Double> roots = new ArrayList<>();
            String line = scanner.nextLine();

            ArrayList<String> stringCoeff = new ArrayList<>(List.of(line.split("\\s+")));
            ArrayList<Double> doubleCoeff = new ArrayList<>();
            for(String coeff : stringCoeff){
                if(coeff.equals("")){
                    continue;
                }
                doubleCoeff.add(Double.parseDouble(coeff));
            }
            if(doubleCoeff.size()==0){
                continue;
            }
            if(doubleCoeff.size()==2){
                solver = new LinearSolver();
                roots.addAll(solver.findRoots(doubleCoeff));
            }else if(doubleCoeff.size()==3){
                solver = new QuadraticSolver();
                roots.addAll(solver.findRoots(doubleCoeff));
            }else {
                solver = new BiquadraticSolver();
                roots.addAll(solver.findRoots(doubleCoeff));
            }

            if (roots.size()<doubleCoeff.size()) {
                if(roots.size()==0) {
                    noRoots.add(doubleCoeff);
                }else if (roots.size()==1 ) {
                    oneRoot.add(doubleCoeff);
                    if(roots.get(0)>maxRoot){
                        maxRoot = roots.get(0);
                    }
                    if(roots.get(0)<minRoot){
                        minRoot = roots.get(0);
                    }
                } else if (roots.size()==2) {
                    twoRoots.add(doubleCoeff);
                } else if (roots.size()==3) {
                    threeRoots.add(doubleCoeff);
                }else{
                    fourRoots.add(doubleCoeff);
                }
            }else{
                infRoots.add(doubleCoeff);
            }

        }

    }

    public ArrayList<ArrayList<Double>> getOneRoot() {
        return oneRoot;
    }

    public ArrayList<ArrayList<Double>> getTwoRoots() {
        return twoRoots;
    }

    public ArrayList<ArrayList<Double>> getThreeRoots() {
        return threeRoots;
    }

    public ArrayList<ArrayList<Double>> getFourRoots() {
        return fourRoots;
    }

    public ArrayList<ArrayList<Double>> getInfRoots() {
        return infRoots;
    }

    public ArrayList<ArrayList<Double>> getNoRoots() {
        return noRoots;
    }

    public double getMaxRoot() {
        return maxRoot;
    }

    public double getMinRoot() {
        return minRoot;
    }
}
