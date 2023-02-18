import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.solveTask("task_3_2/input01.txt");
        System.out.println("Equations without roots");
        for(ArrayList<Double> coef : student.getNoRoots()){
            System.out.println("    equation: "+coef);
        }

        System.out.println("Equations with one root");
        for(ArrayList<Double> coef : student.getOneRoot()){
            System.out.println("    equation: "+coef);
        }
        System.out.println("Minimal root: "+student.getMinRoot());
        System.out.println("Maximal root: "+student.getMaxRoot());

        System.out.println("Equations with two roots");
        for(ArrayList<Double> coef : student.getTwoRoots()){
            System.out.println("    equation: "+coef);
        }

        System.out.println("Equations with three roots");
        for(ArrayList<Double> coef : student.getThreeRoots()){
            System.out.println("    equation: "+coef);
        }

        System.out.println("Equations with four roots");
        for(ArrayList<Double> coef : student.getFourRoots()){
            System.out.println("    equation: "+coef);
        }

        System.out.println("Equations with infinitely many roots");
        for(ArrayList<Double> coef : student.getInfRoots()){
            System.out.println("    equation: "+coef);
        }









    }
}

