import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private ArrayList<Equation> oneRoot = new ArrayList<>();
    private ArrayList<Equation> twoRoots = new ArrayList<>();
    private ArrayList<Equation> threeRoots = new ArrayList<>();
    private ArrayList<Equation> fourRoots = new ArrayList<>();
    private ArrayList<Equation> infRoots = new ArrayList<>();
    private ArrayList<Equation> noRoots = new ArrayList<>();
    private double maxRoot = Double.MIN_NORMAL;
    private double minRoot = Double.MAX_VALUE;
    private Equation minEquation;
    private Equation maxEquation;
    private int checkDeegree(ArrayList<Double> coefficients){
        int n = 0;
        for(double c : coefficients.subList(0,coefficients.size())){
            if(c==0){
                n++;
            }else{
                break;
            }

        }
        return n;
    }
    public void solveTask(String fileName) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanner.hasNextLine()) {
            Solver solver;
            Equation equation;
            ArrayList<Double> roots = new ArrayList<>();
            String line = scanner.nextLine();

            ArrayList<String> stringCoeff = new ArrayList<>(List.of(line.split("\\s+")));
            ArrayList<Double> doubleCoeff = new ArrayList<>();
            for (String coeff : stringCoeff) {
                if (coeff.equals("")) {
                    continue;
                }
                doubleCoeff.add(Double.parseDouble(coeff));
            }
            if (doubleCoeff.size() == 0) {
                continue;
            }
            int index = checkDeegree(doubleCoeff);
            ArrayList<Double> newCoefficients = new ArrayList<>(doubleCoeff.subList(index,doubleCoeff.size()));

            if(newCoefficients.size()==0){
                solver = new LinearSolver();
                equation = solver.creatEquation(doubleCoeff);
                infRoots.add(equation);
                continue;
            } else if (newCoefficients.size()==1) {
                solver = new LinearSolver();
                equation = solver.creatEquation(doubleCoeff);
                noRoots.add(equation);
                continue;
            }else if (newCoefficients.size() == 2) {
                solver = new LinearSolver();
                equation = solver.creatEquation(newCoefficients);

            } else if (newCoefficients.size() == 3) {
                solver = new QuadraticSolver();
                equation = solver.creatEquation(newCoefficients);

            } else {
                solver = new BiquadraticSolver();
                equation = solver.creatEquation(newCoefficients);

            }
            equation.solve();
            equation.setCoefficients(doubleCoeff);
            roots = equation.getRoots();

            if (roots.size() == 0) {
                noRoots.add(equation);
            } else if (roots.size() == 1) {
                oneRoot.add(equation);
                if (roots.get(0) > maxRoot) {
                    maxRoot = roots.get(0);
                    maxEquation = equation;
                }
                if (roots.get(0) < minRoot) {
                    minRoot = roots.get(0);
                    minEquation = equation;
                }
            } else if (roots.size() == 2) {
                twoRoots.add(equation);
            } else if (roots.size() == 3) {
                threeRoots.add(equation);
            } else {
                fourRoots.add(equation);
            }


        }

    }


    public void showMinMaxRoots(){
        System.out.println("Minimal root: "+ minRoot+";  equation: "+minEquation.getCoefficients());
        System.out.println("Maximal root: "+ maxRoot+";  equation: "+maxEquation.getCoefficients());
    }

    public void writeReportFile(String fileName) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(fileName);
        writer.println("--------"+fileName+"--------");
        writer.println("Equations without roots");
        for (Equation equation : noRoots) {
            writer.println("    equation: " + equation.getCoefficients() + ";  roots: " + equation.getRoots());
        }

        writer.println("Equations with one root");
        for (Equation equation : oneRoot) {
            writer.println("    equation: " + equation.getCoefficients() + ";  roots: " + equation.getRoots());
        }
        writer.println("Minimal root: "+ minRoot+";  equation: "+minEquation.getCoefficients());
        writer.println("Maximal root: "+ maxRoot+";  equation: "+maxEquation.getCoefficients());

        writer.println("Equations with two roots");
        for (Equation equation : twoRoots) {
            writer.println("    equation: " + equation.getCoefficients() + ";  roots: " + equation.getRoots());
        }

        writer.println("Equations with three roots");
        for (Equation equation : threeRoots) {
            writer.println("    equation: " + equation.getCoefficients() + ";  roots: " + equation.getRoots());
        }

        writer.println("Equations with four roots");
        for (Equation equation : fourRoots) {
            writer.println("    equation: " + equation.getCoefficients() + ";  roots: " + equation.getRoots());
        }

        writer.println("Equations with infinitely many roots");
        for (Equation equation : infRoots) {
            writer.println("    equation: " + equation.getCoefficients() + ";  roots: infinitely many");
        }
        writer.close();
    }

    public ArrayList<Equation> getOneRoot() {
        return oneRoot;
    }

    public ArrayList<Equation> getTwoRoots() {
        return twoRoots;
    }

    public ArrayList<Equation> getThreeRoots() {
        return threeRoots;
    }

    public ArrayList<Equation> getFourRoots() {
        return fourRoots;
    }

    public ArrayList<Equation> getInfRoots() {
        return infRoots;
    }

    public ArrayList<Equation> getNoRoots() {
        return noRoots;
    }
}
